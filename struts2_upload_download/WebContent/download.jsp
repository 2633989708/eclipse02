<%@page import="java.net.URLEncoder"%>
<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="download.action?fileName=<%=URLEncoder.encode("测试用的RAR.rar", "utf-8").toString().replace("%", "_")%>">测试用的文件</a>
	<a href="download.action?fileName=abc.rar">abc.rar</a>
</body>
</html>