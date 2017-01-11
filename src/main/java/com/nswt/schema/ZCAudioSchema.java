package com.nswt.schema;

import com.nswt.framework.data.DataColumn;
import com.nswt.framework.orm.Schema;
import com.nswt.framework.orm.SchemaSet;
import com.nswt.framework.orm.SchemaColumn;
import com.nswt.framework.data.QueryBuilder;
import java.util.Date;

/**
 * �����ƣ���Ƶ��<br>
 * �����룺ZCAudio<br>
 * ����ע��<br>
һ����Ƶ����û������ID��OwnerID����������Ƶ��ֱ���ϴ�����Ƶ����ʱOwnerID=-1��Type=-1��
��һ������������������ϴ�����Ƶ����ʱOwnerIDΪ���µ�ID��
һ��ͼƬ�����ж��OwnerID����һ��ID��Ӧ���OwnerID�����磬�����Ƶͬʱ����ƪ�����е���Ƶ��
һ����Ƶ�������ڶ�����࣬�����CatalogID��

һ����Ƶ����û������ID��OwnerID����������Ƶ��ֱ���ϴ�����Ƶ����ʱOwnerID=-1��Type=-1��<br>
��һ������������������ϴ�����Ƶ����ʱOwnerIDΪ���µ�ID��<br>
һ��ͼƬ�����ж��OwnerID����һ��ID��Ӧ���OwnerID�����磬�����Ƶͬʱ����ƪ�����е���Ƶ��<br>
һ����Ƶ�������ڶ�����࣬�����CatalogID��<br>
<br>
 * ��������ID<br>
 */
public class ZCAudioSchema extends Schema {
	private Long ID;

	private String Name;

	private String OldName;

	private Long SiteID;

	private String Tag;

	private Long CatalogID;

	private String CatalogInnerCode;

	private String BranchInnerCode;

	private String Path;

	private String FileName;

	private String SrcFileName;

	private String Suffix;

	private String IsOriginal;

	private String Info;

	private String System;

	private String FileSize;

	private Date PublishDate;

	private String Duration;

	private Date ProduceTime;

	private String Author;

	private Long Integral;

	private String SourceURL;

	private Long Status;

	private Long OrderFlag;

	private String Prop1;

	private String Prop2;

	private String Prop3;

	private String Prop4;

	private String AddUser;

	private Date AddTime;

	private String ModifyUser;

	private Date ModifyTime;

	public static final SchemaColumn[] _Columns = new SchemaColumn[] {
		new SchemaColumn("ID", DataColumn.LONG, 0, 0 , 0 , true , true),
		new SchemaColumn("Name", DataColumn.STRING, 1, 100 , 0 , true , false),
		new SchemaColumn("OldName", DataColumn.STRING, 2, 100 , 0 , true , false),
		new SchemaColumn("SiteID", DataColumn.LONG, 3, 0 , 0 , true , false),
		new SchemaColumn("Tag", DataColumn.STRING, 4, 100 , 0 , false , false),
		new SchemaColumn("CatalogID", DataColumn.LONG, 5, 0 , 0 , true , false),
		new SchemaColumn("CatalogInnerCode", DataColumn.STRING, 6, 100 , 0 , true , false),
		new SchemaColumn("BranchInnerCode", DataColumn.STRING, 7, 50 , 0 , false , false),
		new SchemaColumn("Path", DataColumn.STRING, 8, 100 , 0 , true , false),
		new SchemaColumn("FileName", DataColumn.STRING, 9, 100 , 0 , true , false),
		new SchemaColumn("SrcFileName", DataColumn.STRING, 10, 100 , 0 , true , false),
		new SchemaColumn("Suffix", DataColumn.STRING, 11, 10 , 0 , true , false),
		new SchemaColumn("IsOriginal", DataColumn.STRING, 12, 1 , 0 , false , false),
		new SchemaColumn("Info", DataColumn.STRING, 13, 500 , 0 , false , false),
		new SchemaColumn("System", DataColumn.STRING, 14, 20 , 0 , false , false),
		new SchemaColumn("FileSize", DataColumn.STRING, 15, 20 , 0 , false , false),
		new SchemaColumn("PublishDate", DataColumn.DATETIME, 16, 0 , 0 , false , false),
		new SchemaColumn("Duration", DataColumn.STRING, 17, 20 , 0 , false , false),
		new SchemaColumn("ProduceTime", DataColumn.DATETIME, 18, 0 , 0 , false , false),
		new SchemaColumn("Author", DataColumn.STRING, 19, 100 , 0 , false , false),
		new SchemaColumn("Integral", DataColumn.LONG, 20, 0 , 0 , false , false),
		new SchemaColumn("SourceURL", DataColumn.STRING, 21, 500 , 0 , false , false),
		new SchemaColumn("Status", DataColumn.LONG, 22, 0 , 0 , false , false),
		new SchemaColumn("OrderFlag", DataColumn.LONG, 23, 0 , 0 , true , false),
		new SchemaColumn("Prop1", DataColumn.STRING, 24, 50 , 0 , false , false),
		new SchemaColumn("Prop2", DataColumn.STRING, 25, 50 , 0 , false , false),
		new SchemaColumn("Prop3", DataColumn.STRING, 26, 50 , 0 , false , false),
		new SchemaColumn("Prop4", DataColumn.STRING, 27, 50 , 0 , false , false),
		new SchemaColumn("AddUser", DataColumn.STRING, 28, 50 , 0 , true , false),
		new SchemaColumn("AddTime", DataColumn.DATETIME, 29, 0 , 0 , true , false),
		new SchemaColumn("ModifyUser", DataColumn.STRING, 30, 50 , 0 , false , false),
		new SchemaColumn("ModifyTime", DataColumn.DATETIME, 31, 0 , 0 , false , false)
	};

	public static final String _TableCode = "ZCAudio";

	public static final String _NameSpace = "com.nswt.schema";

	protected static final String _InsertAllSQL = "insert into ZCAudio values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	protected static final String _UpdateAllSQL = "update ZCAudio set ID=?,Name=?,OldName=?,SiteID=?,Tag=?,CatalogID=?,CatalogInnerCode=?,BranchInnerCode=?,Path=?,FileName=?,SrcFileName=?,Suffix=?,IsOriginal=?,Info=?,System=?,FileSize=?,PublishDate=?,Duration=?,ProduceTime=?,Author=?,Integral=?,SourceURL=?,Status=?,OrderFlag=?,Prop1=?,Prop2=?,Prop3=?,Prop4=?,AddUser=?,AddTime=?,ModifyUser=?,ModifyTime=? where ID=?";

	protected static final String _DeleteSQL = "delete from ZCAudio  where ID=?";

	protected static final String _FillAllSQL = "select * from ZCAudio  where ID=?";

	public ZCAudioSchema(){
		TableCode = _TableCode;
		NameSpace = _NameSpace;
		Columns = _Columns;
		InsertAllSQL = _InsertAllSQL;
		UpdateAllSQL = _UpdateAllSQL;
		DeleteSQL = _DeleteSQL;
		FillAllSQL = _FillAllSQL;
		HasSetFlag = new boolean[32];
	}

	protected Schema newInstance(){
		return new ZCAudioSchema();
	}

	protected SchemaSet newSet(){
		return new ZCAudioSet();
	}

	public ZCAudioSet query() {
		return query(null, -1, -1);
	}

	public ZCAudioSet query(QueryBuilder qb) {
		return query(qb, -1, -1);
	}

	public ZCAudioSet query(int pageSize, int pageIndex) {
		return query(null, pageSize, pageIndex);
	}

	public ZCAudioSet query(QueryBuilder qb , int pageSize, int pageIndex){
		return (ZCAudioSet)querySet(qb , pageSize , pageIndex);
	}

	public void setV(int i, Object v) {
		if (i == 0){if(v==null){ID = null;}else{ID = new Long(v.toString());}return;}
		if (i == 1){Name = (String)v;return;}
		if (i == 2){OldName = (String)v;return;}
		if (i == 3){if(v==null){SiteID = null;}else{SiteID = new Long(v.toString());}return;}
		if (i == 4){Tag = (String)v;return;}
		if (i == 5){if(v==null){CatalogID = null;}else{CatalogID = new Long(v.toString());}return;}
		if (i == 6){CatalogInnerCode = (String)v;return;}
		if (i == 7){BranchInnerCode = (String)v;return;}
		if (i == 8){Path = (String)v;return;}
		if (i == 9){FileName = (String)v;return;}
		if (i == 10){SrcFileName = (String)v;return;}
		if (i == 11){Suffix = (String)v;return;}
		if (i == 12){IsOriginal = (String)v;return;}
		if (i == 13){Info = (String)v;return;}
		if (i == 14){System = (String)v;return;}
		if (i == 15){FileSize = (String)v;return;}
		if (i == 16){PublishDate = (Date)v;return;}
		if (i == 17){Duration = (String)v;return;}
		if (i == 18){ProduceTime = (Date)v;return;}
		if (i == 19){Author = (String)v;return;}
		if (i == 20){if(v==null){Integral = null;}else{Integral = new Long(v.toString());}return;}
		if (i == 21){SourceURL = (String)v;return;}
		if (i == 22){if(v==null){Status = null;}else{Status = new Long(v.toString());}return;}
		if (i == 23){if(v==null){OrderFlag = null;}else{OrderFlag = new Long(v.toString());}return;}
		if (i == 24){Prop1 = (String)v;return;}
		if (i == 25){Prop2 = (String)v;return;}
		if (i == 26){Prop3 = (String)v;return;}
		if (i == 27){Prop4 = (String)v;return;}
		if (i == 28){AddUser = (String)v;return;}
		if (i == 29){AddTime = (Date)v;return;}
		if (i == 30){ModifyUser = (String)v;return;}
		if (i == 31){ModifyTime = (Date)v;return;}
	}

	public Object getV(int i) {
		if (i == 0){return ID;}
		if (i == 1){return Name;}
		if (i == 2){return OldName;}
		if (i == 3){return SiteID;}
		if (i == 4){return Tag;}
		if (i == 5){return CatalogID;}
		if (i == 6){return CatalogInnerCode;}
		if (i == 7){return BranchInnerCode;}
		if (i == 8){return Path;}
		if (i == 9){return FileName;}
		if (i == 10){return SrcFileName;}
		if (i == 11){return Suffix;}
		if (i == 12){return IsOriginal;}
		if (i == 13){return Info;}
		if (i == 14){return System;}
		if (i == 15){return FileSize;}
		if (i == 16){return PublishDate;}
		if (i == 17){return Duration;}
		if (i == 18){return ProduceTime;}
		if (i == 19){return Author;}
		if (i == 20){return Integral;}
		if (i == 21){return SourceURL;}
		if (i == 22){return Status;}
		if (i == 23){return OrderFlag;}
		if (i == 24){return Prop1;}
		if (i == 25){return Prop2;}
		if (i == 26){return Prop3;}
		if (i == 27){return Prop4;}
		if (i == 28){return AddUser;}
		if (i == 29){return AddTime;}
		if (i == 30){return ModifyUser;}
		if (i == 31){return ModifyTime;}
		return null;
	}

	/**
	* ��ȡ�ֶ�ID��ֵ�����ֶε�<br>
	* �ֶ����� :��ƵID<br>
	* �������� :bigint<br>
	* �Ƿ����� :true<br>
	* �Ƿ���� :true<br>
	*/
	public long getID() {
		if(ID==null){return 0;}
		return ID.longValue();
	}

	/**
	* �����ֶ�ID��ֵ�����ֶε�<br>
	* �ֶ����� :��ƵID<br>
	* �������� :bigint<br>
	* �Ƿ����� :true<br>
	* �Ƿ���� :true<br>
	*/
	public void setID(long iD) {
		this.ID = new Long(iD);
    }

	/**
	* �����ֶ�ID��ֵ�����ֶε�<br>
	* �ֶ����� :��ƵID<br>
	* �������� :bigint<br>
	* �Ƿ����� :true<br>
	* �Ƿ���� :true<br>
	*/
	public void setID(String iD) {
		if (iD == null){
			this.ID = null;
			return;
		}
		this.ID = new Long(iD);
    }

	/**
	* ��ȡ�ֶ�Name��ֵ�����ֶε�<br>
	* �ֶ����� :ͼƬ����<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public String getName() {
		return Name;
	}

	/**
	* �����ֶ�Name��ֵ�����ֶε�<br>
	* �ֶ����� :ͼƬ����<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setName(String name) {
		this.Name = name;
    }

	/**
	* ��ȡ�ֶ�OldName��ֵ�����ֶε�<br>
	* �ֶ����� :ԭʼ����<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public String getOldName() {
		return OldName;
	}

	/**
	* �����ֶ�OldName��ֵ�����ֶε�<br>
	* �ֶ����� :ԭʼ����<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setOldName(String oldName) {
		this.OldName = oldName;
    }

	/**
	* ��ȡ�ֶ�SiteID��ֵ�����ֶε�<br>
	* �ֶ����� :����վ��ID<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public long getSiteID() {
		if(SiteID==null){return 0;}
		return SiteID.longValue();
	}

	/**
	* �����ֶ�SiteID��ֵ�����ֶε�<br>
	* �ֶ����� :����վ��ID<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setSiteID(long siteID) {
		this.SiteID = new Long(siteID);
    }

	/**
	* �����ֶ�SiteID��ֵ�����ֶε�<br>
	* �ֶ����� :����վ��ID<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setSiteID(String siteID) {
		if (siteID == null){
			this.SiteID = null;
			return;
		}
		this.SiteID = new Long(siteID);
    }

	/**
	* ��ȡ�ֶ�Tag��ֵ�����ֶε�<br>
	* �ֶ����� :��ǩ<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getTag() {
		return Tag;
	}

	/**
	* �����ֶ�Tag��ֵ�����ֶε�<br>
	* �ֶ����� :��ǩ<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setTag(String tag) {
		this.Tag = tag;
    }

	/**
	* ��ȡ�ֶ�CatalogID��ֵ�����ֶε�<br>
	* �ֶ����� :������Ŀ<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public long getCatalogID() {
		if(CatalogID==null){return 0;}
		return CatalogID.longValue();
	}

	/**
	* �����ֶ�CatalogID��ֵ�����ֶε�<br>
	* �ֶ����� :������Ŀ<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setCatalogID(long catalogID) {
		this.CatalogID = new Long(catalogID);
    }

	/**
	* �����ֶ�CatalogID��ֵ�����ֶε�<br>
	* �ֶ����� :������Ŀ<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setCatalogID(String catalogID) {
		if (catalogID == null){
			this.CatalogID = null;
			return;
		}
		this.CatalogID = new Long(catalogID);
    }

	/**
	* ��ȡ�ֶ�CatalogInnerCode��ֵ�����ֶε�<br>
	* �ֶ����� :��Ŀ�ڲ�����<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public String getCatalogInnerCode() {
		return CatalogInnerCode;
	}

	/**
	* �����ֶ�CatalogInnerCode��ֵ�����ֶε�<br>
	* �ֶ����� :��Ŀ�ڲ�����<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setCatalogInnerCode(String catalogInnerCode) {
		this.CatalogInnerCode = catalogInnerCode;
    }

	/**
	* ��ȡ�ֶ�BranchInnerCode��ֵ�����ֶε�<br>
	* �ֶ����� :���������ڲ�����<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getBranchInnerCode() {
		return BranchInnerCode;
	}

	/**
	* �����ֶ�BranchInnerCode��ֵ�����ֶε�<br>
	* �ֶ����� :���������ڲ�����<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setBranchInnerCode(String branchInnerCode) {
		this.BranchInnerCode = branchInnerCode;
    }

	/**
	* ��ȡ�ֶ�Path��ֵ�����ֶε�<br>
	* �ֶ����� :·��<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public String getPath() {
		return Path;
	}

	/**
	* �����ֶ�Path��ֵ�����ֶε�<br>
	* �ֶ����� :·��<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setPath(String path) {
		this.Path = path;
    }

	/**
	* ��ȡ�ֶ�FileName��ֵ�����ֶε�<br>
	* �ֶ����� :��Ƶ�ļ���<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public String getFileName() {
		return FileName;
	}

	/**
	* �����ֶ�FileName��ֵ�����ֶε�<br>
	* �ֶ����� :��Ƶ�ļ���<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setFileName(String fileName) {
		this.FileName = fileName;
    }

	/**
	* ��ȡ�ֶ�SrcFileName��ֵ�����ֶε�<br>
	* �ֶ����� :ԭʼ�ļ�<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public String getSrcFileName() {
		return SrcFileName;
	}

	/**
	* �����ֶ�SrcFileName��ֵ�����ֶε�<br>
	* �ֶ����� :ԭʼ�ļ�<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setSrcFileName(String srcFileName) {
		this.SrcFileName = srcFileName;
    }

	/**
	* ��ȡ�ֶ�Suffix��ֵ�����ֶε�<br>
	* �ֶ����� :��׺��<br>
	* �������� :varchar(10)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public String getSuffix() {
		return Suffix;
	}

	/**
	* �����ֶ�Suffix��ֵ�����ֶε�<br>
	* �ֶ����� :��׺��<br>
	* �������� :varchar(10)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setSuffix(String suffix) {
		this.Suffix = suffix;
    }

	/**
	* ��ȡ�ֶ�IsOriginal��ֵ�����ֶε�<br>
	* �ֶ����� :�Ƿ�ԭ��<br>
	* �������� :char(1)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getIsOriginal() {
		return IsOriginal;
	}

	/**
	* �����ֶ�IsOriginal��ֵ�����ֶε�<br>
	* �ֶ����� :�Ƿ�ԭ��<br>
	* �������� :char(1)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setIsOriginal(String isOriginal) {
		this.IsOriginal = isOriginal;
    }

	/**
	* ��ȡ�ֶ�Info��ֵ�����ֶε�<br>
	* �ֶ����� :��Ƶ����<br>
	* �������� :varchar(500)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getInfo() {
		return Info;
	}

	/**
	* �����ֶ�Info��ֵ�����ֶε�<br>
	* �ֶ����� :��Ƶ����<br>
	* �������� :varchar(500)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setInfo(String info) {
		this.Info = info;
    }

	/**
	* ��ȡ�ֶ�System��ֵ�����ֶε�<br>
	* �ֶ����� :����ϵͳ<br>
	* �������� :varchar(20)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	* ��ע��Ϣ :<br>
	CMS<br>
	OA<br>
	CRM<br>
	*/
	public String getSystem() {
		return System;
	}

	/**
	* �����ֶ�System��ֵ�����ֶε�<br>
	* �ֶ����� :����ϵͳ<br>
	* �������� :varchar(20)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	* ��ע��Ϣ :<br>
	CMS<br>
	OA<br>
	CRM<br>
	*/
	public void setSystem(String system) {
		this.System = system;
    }

	/**
	* ��ȡ�ֶ�FileSize��ֵ�����ֶε�<br>
	* �ֶ����� :��Ƶ��С<br>
	* �������� :varchar(20)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getFileSize() {
		return FileSize;
	}

	/**
	* �����ֶ�FileSize��ֵ�����ֶε�<br>
	* �ֶ����� :��Ƶ��С<br>
	* �������� :varchar(20)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setFileSize(String fileSize) {
		this.FileSize = fileSize;
    }

	/**
	* ��ȡ�ֶ�PublishDate��ֵ�����ֶε�<br>
	* �ֶ����� :����ʱ��<br>
	* �������� :datetime<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public Date getPublishDate() {
		return PublishDate;
	}

	/**
	* �����ֶ�PublishDate��ֵ�����ֶε�<br>
	* �ֶ����� :����ʱ��<br>
	* �������� :datetime<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setPublishDate(Date publishDate) {
		this.PublishDate = publishDate;
    }

	/**
	* ��ȡ�ֶ�Duration��ֵ�����ֶε�<br>
	* �ֶ����� :��ʱ��<br>
	* �������� :varchar(20)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getDuration() {
		return Duration;
	}

	/**
	* �����ֶ�Duration��ֵ�����ֶε�<br>
	* �ֶ����� :��ʱ��<br>
	* �������� :varchar(20)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setDuration(String duration) {
		this.Duration = duration;
    }

	/**
	* ��ȡ�ֶ�ProduceTime��ֵ�����ֶε�<br>
	* �ֶ����� :����ʱ��<br>
	* �������� :datetime<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public Date getProduceTime() {
		return ProduceTime;
	}

	/**
	* �����ֶ�ProduceTime��ֵ�����ֶε�<br>
	* �ֶ����� :����ʱ��<br>
	* �������� :datetime<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setProduceTime(Date produceTime) {
		this.ProduceTime = produceTime;
    }

	/**
	* ��ȡ�ֶ�Author��ֵ�����ֶε�<br>
	* �ֶ����� :����<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getAuthor() {
		return Author;
	}

	/**
	* �����ֶ�Author��ֵ�����ֶε�<br>
	* �ֶ����� :����<br>
	* �������� :varchar(100)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setAuthor(String author) {
		this.Author = author;
    }

	/**
	* ��ȡ�ֶ�Integral��ֵ�����ֶε�<br>
	* �ֶ����� :����<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public long getIntegral() {
		if(Integral==null){return 0;}
		return Integral.longValue();
	}

	/**
	* �����ֶ�Integral��ֵ�����ֶε�<br>
	* �ֶ����� :����<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setIntegral(long integral) {
		this.Integral = new Long(integral);
    }

	/**
	* �����ֶ�Integral��ֵ�����ֶε�<br>
	* �ֶ����� :����<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setIntegral(String integral) {
		if (integral == null){
			this.Integral = null;
			return;
		}
		this.Integral = new Long(integral);
    }

	/**
	* ��ȡ�ֶ�SourceURL��ֵ�����ֶε�<br>
	* �ֶ����� :��ԴURL<br>
	* �������� :varchar(500)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	* ��ע��Ϣ :<br>
	�ɼ�ʱ���ô��ֶε�ֵ�������ж��Ƿ��Ѿ�������<br>
	*/
	public String getSourceURL() {
		return SourceURL;
	}

	/**
	* �����ֶ�SourceURL��ֵ�����ֶε�<br>
	* �ֶ����� :��ԴURL<br>
	* �������� :varchar(500)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	* ��ע��Ϣ :<br>
	�ɼ�ʱ���ô��ֶε�ֵ�������ж��Ƿ��Ѿ�������<br>
	*/
	public void setSourceURL(String sourceURL) {
		this.SourceURL = sourceURL;
    }

	/**
	* ��ȡ�ֶ�Status��ֵ�����ֶε�<br>
	* �ֶ����� :״̬<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public long getStatus() {
		if(Status==null){return 0;}
		return Status.longValue();
	}

	/**
	* �����ֶ�Status��ֵ�����ֶε�<br>
	* �ֶ����� :״̬<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setStatus(long status) {
		this.Status = new Long(status);
    }

	/**
	* �����ֶ�Status��ֵ�����ֶε�<br>
	* �ֶ����� :״̬<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setStatus(String status) {
		if (status == null){
			this.Status = null;
			return;
		}
		this.Status = new Long(status);
    }

	/**
	* ��ȡ�ֶ�OrderFlag��ֵ�����ֶε�<br>
	* �ֶ����� :�����ֶ�<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public long getOrderFlag() {
		if(OrderFlag==null){return 0;}
		return OrderFlag.longValue();
	}

	/**
	* �����ֶ�OrderFlag��ֵ�����ֶε�<br>
	* �ֶ����� :�����ֶ�<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setOrderFlag(long orderFlag) {
		this.OrderFlag = new Long(orderFlag);
    }

	/**
	* �����ֶ�OrderFlag��ֵ�����ֶε�<br>
	* �ֶ����� :�����ֶ�<br>
	* �������� :bigint<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setOrderFlag(String orderFlag) {
		if (orderFlag == null){
			this.OrderFlag = null;
			return;
		}
		this.OrderFlag = new Long(orderFlag);
    }

	/**
	* ��ȡ�ֶ�Prop1��ֵ�����ֶε�<br>
	* �ֶ����� :�����ֶ�1<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getProp1() {
		return Prop1;
	}

	/**
	* �����ֶ�Prop1��ֵ�����ֶε�<br>
	* �ֶ����� :�����ֶ�1<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setProp1(String prop1) {
		this.Prop1 = prop1;
    }

	/**
	* ��ȡ�ֶ�Prop2��ֵ�����ֶε�<br>
	* �ֶ����� :�����ֶ�2<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getProp2() {
		return Prop2;
	}

	/**
	* �����ֶ�Prop2��ֵ�����ֶε�<br>
	* �ֶ����� :�����ֶ�2<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setProp2(String prop2) {
		this.Prop2 = prop2;
    }

	/**
	* ��ȡ�ֶ�Prop3��ֵ�����ֶε�<br>
	* �ֶ����� :�����ֶ�3<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getProp3() {
		return Prop3;
	}

	/**
	* �����ֶ�Prop3��ֵ�����ֶε�<br>
	* �ֶ����� :�����ֶ�3<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setProp3(String prop3) {
		this.Prop3 = prop3;
    }

	/**
	* ��ȡ�ֶ�Prop4��ֵ�����ֶε�<br>
	* �ֶ����� :�����ֶ�4<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getProp4() {
		return Prop4;
	}

	/**
	* �����ֶ�Prop4��ֵ�����ֶε�<br>
	* �ֶ����� :�����ֶ�4<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setProp4(String prop4) {
		this.Prop4 = prop4;
    }

	/**
	* ��ȡ�ֶ�AddUser��ֵ�����ֶε�<br>
	* �ֶ����� :������<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public String getAddUser() {
		return AddUser;
	}

	/**
	* �����ֶ�AddUser��ֵ�����ֶε�<br>
	* �ֶ����� :������<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setAddUser(String addUser) {
		this.AddUser = addUser;
    }

	/**
	* ��ȡ�ֶ�AddTime��ֵ�����ֶε�<br>
	* �ֶ����� :����ʱ��<br>
	* �������� :datetime<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public Date getAddTime() {
		return AddTime;
	}

	/**
	* �����ֶ�AddTime��ֵ�����ֶε�<br>
	* �ֶ����� :����ʱ��<br>
	* �������� :datetime<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :true<br>
	*/
	public void setAddTime(Date addTime) {
		this.AddTime = addTime;
    }

	/**
	* ��ȡ�ֶ�ModifyUser��ֵ�����ֶε�<br>
	* �ֶ����� :����޸���<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public String getModifyUser() {
		return ModifyUser;
	}

	/**
	* �����ֶ�ModifyUser��ֵ�����ֶε�<br>
	* �ֶ����� :����޸���<br>
	* �������� :varchar(50)<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setModifyUser(String modifyUser) {
		this.ModifyUser = modifyUser;
    }

	/**
	* ��ȡ�ֶ�ModifyTime��ֵ�����ֶε�<br>
	* �ֶ����� :����޸�ʱ��<br>
	* �������� :datetime<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public Date getModifyTime() {
		return ModifyTime;
	}

	/**
	* �����ֶ�ModifyTime��ֵ�����ֶε�<br>
	* �ֶ����� :����޸�ʱ��<br>
	* �������� :datetime<br>
	* �Ƿ����� :false<br>
	* �Ƿ���� :false<br>
	*/
	public void setModifyTime(Date modifyTime) {
		this.ModifyTime = modifyTime;
    }

}