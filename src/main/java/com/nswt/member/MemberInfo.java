package com.nswt.member;

import java.util.Date;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import com.nswt.cms.dataservice.MemberField;
import com.nswt.cms.pub.SiteUtil;
import com.nswt.framework.Ajax;
import com.nswt.framework.User;
import com.nswt.framework.data.QueryBuilder;
import com.nswt.framework.utility.HtmlUtil;
import com.nswt.framework.utility.Mapx;
import com.nswt.framework.utility.StringUtil;
import com.nswt.schema.ZCForumMemberSchema;
import com.nswt.schema.ZDMemberCompanyInfoSchema;
import com.nswt.schema.ZDMemberPersonInfoSchema;

public class MemberInfo extends Ajax {
	
	public static Mapx init(Mapx params) {
		String UserName = User.getUserName();
		if(StringUtil.isNotEmpty(UserName)){
			Member m = new Member(UserName);
			m.fill();
			if(StringUtil.isEmpty(m.getType())){
				m.setType("Person");
			}
			if(m.getType().equals("Person")){
				params.put("MemberType","个人");
			}else{
				params.put("MemberType","企业");
			}
			params.putAll(m.toMapx());
			params.put("Gender",HtmlUtil.codeToRadios("Gender","Gender",m.getGender()));
			params.put("MemberLevelName",new QueryBuilder("select Name from ZDMemberLevel where ID = ?",Long.parseLong(m.getMemberLevel())).executeString());
			if(m.getStatus().equals("Y")){
				params.put("StatusName","通过审核");
			}else if(m.getStatus().equals("X")){
				params.put("StatusName","等待审核");
			}else{
				params.put("StatusName","审核未通过");
			}
			params.put("Columns",MemberField.getColumnAndValue(m));
			if(StringUtil.isEmpty(params.getString("Logo"))){
				params.put("Logo","../Images/nophoto.jpg");
			}
		}
		return params;
	}
	
	public static Mapx initDetail(Mapx params){
		String UserName = User.getUserName();
		if(StringUtil.isNotEmpty(UserName)){
			Member m = new Member(UserName);
			m.fill();
			if(StringUtil.isEmpty(m.getType())){
				m.setType("Person");
			}
			if(m.getType().equals("Person")){
				params.put("MemberType","个人");
				ZDMemberPersonInfoSchema person = new ZDMemberPersonInfoSchema();
				person.setUserName(m.getUserName());
				person.fill();
				params.putAll(person.toMapx());
			}else{
				params.put("MemberType","企业");
				ZDMemberCompanyInfoSchema company = new ZDMemberCompanyInfoSchema();
				company.setUserName(m.getUserName());
				company.fill();
				params.putAll(company.toMapx());
			}
			params.putAll(m.toMapx());
			if(StringUtil.isEmpty(params.getString("Pic"))){
				params.put("PicPath","../Images/nopicture.jpg");
			}else{
				params.put("PicPath",params.getString("Pic"));
			}
		}
		return params;
	}
	
	public void doSave(){
		String UserName = $V("UserName");
		Member member = new Member(UserName);
		member.fill();
		member = MemberField.setPropValues(member,Request);
		member.setValue(Request);
		if(StringUtil.isEmpty(member.getName())){
			member.setName("注册用户");
		}
		if(member.update()){
			if(member.getType().equalsIgnoreCase("Person")){
				ZDMemberPersonInfoSchema person = new ZDMemberPersonInfoSchema();
				person.setUserName(member.getUserName());
				if(person.fill()){
					person.setNickName(member.getName());
					person.update();
				}
			}else{
				ZDMemberCompanyInfoSchema company = new ZDMemberCompanyInfoSchema();
				company.setUserName(member.getUserName());
				if(company.fill()){
					company.setCompanyName(member.getName());
					company.setEmail(member.getEmail());
					company.update();
				}
			}
			ZCForumMemberSchema forumMember = new ZCForumMemberSchema();
			forumMember.setUserName(UserName);
			if(forumMember.fill()){
				if(StringUtil.isEmpty(forumMember.getHeadImage())&&StringUtil.isNotEmpty(member.getLogo())){
					forumMember.setHeadImage(member.getLogo());
				}
				if(StringUtil.isEmpty(forumMember.getNickName())){
					forumMember.setNickName($V("Name"));
					forumMember.setModifyUser(UserName);
					forumMember.setModifyTime(new Date());
				}
				forumMember.update();
			}
			Response.setLogInfo(1,"保存成功");
		}else{
			Response.setLogInfo(0,"保存失败");
		}
	}
	
	public void doDetailSave(){
		String UserName = $V("UserName");
		Member member = new Member(UserName);
		member.fill();
		member.setValue(Request);
		if(member.getType().equalsIgnoreCase("Person")){
			ZDMemberPersonInfoSchema person = new ZDMemberPersonInfoSchema();
			person.setUserName(member.getUserName());
			if(person.fill()){
				person.setValue(Request);
				person.update();
			}else{
				person.setValue(Request);
				person.insert();
			}
		}else{
			ZDMemberCompanyInfoSchema company = new ZDMemberCompanyInfoSchema();
			company.setUserName(member.getUserName());
			if(company.fill()){
				company.setValue(Request);
				company.update();
			}else{
				company.setValue(Request);
				company.insert();
			}
		}
		if(member.update()){
			Response.setLogInfo(1,"保存成功");
		}else{
			Response.setLogInfo(0,"保存失败");
		}
	}
	
	public void modifyPassword(){
		String UserName = $V("UserName");
		String OldPassWord = $V("OldPassWord").trim();
		String NewPassWord = $V("NewPassWord").trim();
		String ConfirmPassword = $V("ConfirmPassword").trim();
		Member member = new Member();
		member.setUserName(UserName);
		member.fill();
		String password = member.getPassword();
		if(StringUtil.md5Hex(OldPassWord).equals(password)){
			if(NewPassWord.equals(ConfirmPassword)){
				member.setPassword(NewPassWord);
				if(member.update()){
					Response.setLogInfo(1,"修改密码成功");
				}else{
					Response.setLogInfo(0,"修改密码失败");
				}
			}else{
				Response.setLogInfo(0,"两次输入的密码不一致");
			}
		}else{
			Response.setLogInfo(0,"原密码错误");
		}
	}
	
	public void resetPassword(){
		String UserName = $V("UserName");
		String NewPassWord = $V("NewPassWord").trim();
		String ConfirmPassword = $V("ConfirmPassword").trim();
		Member member = new Member(UserName);
		member.fill();
		if(StringUtil.isNotEmpty(member.getPWQuestion())){
			if(NewPassWord.equals(ConfirmPassword)){
				member.setPassword(NewPassWord);
				member.setPWQuestion("");
				if(member.update()){
					Response.setLogInfo(1,"重置密码成功");
					Response.put("SiteID",member.getSiteID());
				}else{
					Response.setLogInfo(0,"重置密码失败");
				}
			}else{
				Response.setLogInfo(0,"两次输入的密码不一致");
			}
		}else{
			Response.setLogInfo(0,"修改链接已过期");
		}
	}
	
	public void getPassWord(){
		String UserName = $V("UserName");
		String URL = $V("URL");
		URL = URL.substring(0,URL.lastIndexOf("/")+1);
		if(StringUtil.isNotEmpty(UserName)){
			Member member = new Member(UserName);
			if(member.fill()){
				String SiteName = SiteUtil.getName(member.getSiteID());
				String to = member.getEmail();
				if(StringUtil.isNotEmpty(to)){
					SimpleEmail email = new SimpleEmail();
					email.setHostName("smtp.163.com");
					try {
						String pwq = StringUtil.md5Hex(member.getUserName()+System.currentTimeMillis());
						StringBuffer sb = new StringBuffer();
						sb.append("尊敬的"+SiteName+"用户：<br/>");
						sb.append("你好！<br/>");
						sb.append("<a href='"+URL+"GetPassword.jsp?User="+member.getUserName()+"&pwq="+pwq+"&SiteID="+member.getSiteID()+"'>请点击此处修改您的密码</a><br/>");
						sb.append("如果上面的链接无法点击，可能是您在以纯文本模式查看邮件，请复制以下地址，粘贴到浏览器地址栏然后按“回车键”直接访问<br/>");
						sb.append(URL+"GetPassword.jsp?User="+member.getUserName()+"&pwq="+pwq);
						sb.append("<br/><br/>注：此邮件为系统自动发送，请勿回复。<br/>");
						sb.append("　　　　　　　　　　　　　　　　　　　　　　　————"+SiteName);
						member.setLoginMD5(pwq);
						email.setAuthentication("0871huhu@163.com","08715121182");
						email.addTo(to,member.getUserName());
						email.setFrom("0871huhu@163.com", SiteName);
						email.setSubject(SiteName+"：找回您的密码");
						email.setContent(sb.toString(), "text/html;charset=utf-8");
						if(member.update()){
							Response.setLogInfo(1,"系统已经发送密码重置链接到您注册时填写的电子邮箱，请查收");
							Response.put("SiteID",member.getSiteID());
						}else{
							Response.setLogInfo(0,"系统错误");
						}
					} catch (EmailException e) {
						Response.setLogInfo(0,"邮件发送错误");
						e.printStackTrace();
					}
				}
			}else{
				Response.setLogInfo(0,"用户名不存在");
			}
		}
	}
	
}
