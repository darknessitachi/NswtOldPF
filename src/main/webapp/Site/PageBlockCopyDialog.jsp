<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="../Include/Init.jsp"%>
<%@ taglib uri="controls" prefix="z"%>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7">
<title></title>
<script src="../Framework/Main.js"></script>
<link href="../Include/Default.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
</head>
<body class="dialogBody">
<form id="form2">
<%
String CatalogType = request.getParameter("CatalogType");
%>
<table width="100%" cellpadding="2" cellspacing="0">
	<tr>
		<td width="619" height="10">
		<input type="hidden" id="type" value="${type}" name="type">
		<input type="hidden" id="CatalogType" value="<%=CatalogType%>" name="CatalogType"></td>
		<td></td>
	</tr>
	<tr>
		<td align="right">���Ƶ�:</td>
		<td width="762">
		<z:select id="copyType" style="width:120px;"
			onchange="changeCopyType"><span value="0"> ָ����Ŀ</span> <span
			value="1"> ��������Ŀ</span> <span value="2"> ������Ŀ</span> <span value="3">
		����ͬ����Ŀ</span></z:select>
		</td>
	</tr>
	<tr>
		<td align="right">��������:</td>
		<td width="762"><z:select name="CatalogID" id="CatalogID"
			listWidth="200" listHeight="300"
			listURL="Site/CatalogSelectList.jsp?Type=3&CatalogType=<%=CatalogType%>"></z:select>
		</td>

	</tr>


</table>
</form>
</body>
</html>