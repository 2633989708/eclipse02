<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jquery-1.10.2.js"> </script>
<title>Insert title here</title>
<script type="text/javascript">
	function callAction(){
		
		$.get("ajax.action?t="+new Date().getTime());
	}
	function callDate(){
		$.get("listString.action?d="+new Date().getTime(),function(data){
			console.log(data);
		});
		
	}
</script>
</head>
<body>
	<input type="button" value="jquery" onclick="callAction()" />
	<input type="button" value="returnDate" onclick="callDate()" />
</body>
</html>