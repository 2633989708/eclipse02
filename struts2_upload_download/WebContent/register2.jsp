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
	<s:form action="register2" method="post" enctype="multipart/form-data">
	username:<s:textfield name="username"></s:textfield>
	<br>
	<s:file name="uploadFile"></s:file>
	<br>
	<s:file name="uploadFile"></s:file>
	<br>
	<s:file name="uploadFile"></s:file>
	<s:submit value="提交"></s:submit>
	</s:form>	
</body>
</html>