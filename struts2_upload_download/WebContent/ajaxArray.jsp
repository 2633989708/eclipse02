<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="json2.js"> </script>
<script type="text/javascript">
	var myAjaxObject;
	function getMethod(){
		var valueArray=new Array();
		valueArray[0]='项目1';
		valueArray[1]='项目2';
		valueArray[2]='项目3';
		valueArray[3]=true;
		valueArray[4]=110.01;
		
		var JSONString =JSON.stringify(valueArray);
		alert(JSONString);
		
		if(window.ActiveXObject){
			myAjaxObject=new ActiveXObject("Miscroft.XMLHTTP");
			
		}else{
			myAjaxObject=new XMLHttpRequest();
		}
		var urlString ="jsonString="+JSONString+"&timstamp="+new Date().getTime();
		alert(urlString);
		myAjaxObject.open("get","ajax.action?"+urlString,true);
		myAjaxObject.send(null);
		
	}
	function postMethod(){
		var valueArray=new Array();
		valueArray[0]='sfaoj';
		valueArray[1]=100;
		valueArray[2]=true;
		valueArray[3]=1001.001;
		var JSONString=JSON.stringify(valueArray);
		alert(JSONString);
		if(window.activeXObject){
			myAjaxObject=new ActiveXObject("Microsoft.XMLHTTP");
			
		}else{
			myAjaxObject=new XMLHttpRequest();
		}
		var urlString ="jsonString="+JSONString+"&timestamp="+new Date().getTime();
		alert(urlString);
		myAjaxObject.open("POST","ajax.action",true);
		myAjaxObject.setRequestHeader("Content-Type","application/x-www-urlencoded");
		myAjaxObject.send(urlString);
		
		
		
	}
	

</script>
</head>
<body>
	<input type="button" value="get" onclick="getMethod()" />
	<input type="button" value="post" onclick="postMethod()" />
</body>
</html>