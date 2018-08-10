<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="json2.js"></script>
<script type="text/javascript">
	var myAjaxObject;
	function ajaxTransferText(){
		var BigText=document.getElementById("BigText").value;
		var ajaxTransferObjectRef=new ajaxTransferObject("username","password",10,BigText);
		var JsonString=JSON.stringify(ajaxTransferObjectRef);
		if(window.ActiveXObject){
			myAjaxObject=new ActiveXObject("Microsoft.XMLHTTP");
		}else{
			myAjaxObject=new XMLHttpRequest();
		}
		//var urlString ="jsonString="+JsonString;//post url方式
		var urlString="jsonString="+JsonString+"&timestamp="+new Date().getTime();//get url方式
		alert(urlString);
		//myAjaxObject.open("POST","ajax.action"+"?timestamp="+new Date().getTime(),true);//post方式提交
		myAjaxObject.open("GET","ajax.action?"+urlString,true);//get方式提交
		//myAjaxObject.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		
		//myAjaxObject.send(urlString); post方式方式数据
		myAjaxObject.send(null);//get方式
	}
	
	function ajaxTransferObject(username,password,age,BigText){
		this.username=username;
		this.password=password;
		this.age=age;
		this.BigText=BigText;
		
	}
</script>
</head>
<body>
	<textarea rows="5" cols="45" name="textarea" id="BigText" ></textarea>
	<br>
	<input type="button" value="test" onclick="ajaxTransferText()" />
</body>
</html>