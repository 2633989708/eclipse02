<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="json2.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	var myAjaxObject;
	function getListStrng(){
		if(window.ActiveXObject){
			myAjaxObject=new ActiveXObect("Miscrosoft-HTTP");
		}else{
			myAjaxObject=new XMLHttpRequest();
		}
		myAjaxObject.open("get", "listString.action?date="+new Date().getTime(), "true");
		myAjaxObject.onreadystatechange=returnListString;
		myAjaxObject.send();
		
	}
	function returnListString(){
		if(myAjaxObject.status=200){
			var returnJSONString=myAjaxObject.responseText;
			var returnJSON=JSON.parse(returnJSONString);
			alert(returnJSON);
			
		}
	}
	function getListBean(){
		
		if(window.ActiveXObject){
			myAjaxObject=new ActiveXObject("Miscrosoft-HTTP");
			
		}else{
			myAjaxObject=new XMLHttpRequest();
		}
		myAjaxObject.open("get", "listBean.action?date="+new Date().getTime(), true);
		myAjaxObject.onreadystatechange=returnListBean;
		myAjaxObject.send();
	}
	function returnListBean(){
		if(myAjaxObject.readyState==4){
			if(myAjaxObject.status==200){
				var returnJSONString=myAjaxObject.responseText;
				var returnJSON=JSON.parse(returnJSONString);
				
				alert(returnJSON);
			}
		}
		
	}
	function getMapString(){
		if(window.ActiveXObject){
			myAjaxObject=new ActiveXObjec("Microsoft-HTTP");
		}else{
			myAjaxObject=new XMLHttpRequest();
		}
		myAjaxObject.open("get", "mapString.action?date="+new Date().getTime(), 
				true);
		myAjaxObject.onreadystatechange=returnMapString;
		myAjaxObject.send();
	}
	
	function returnMapString(){
		if(myAjaxObject.readyState==4){
			if(myAjaxObject.status==200){
				var returnJSONString=myAjaxObject.responseText;
				var returnJSON=JSON.parse(returnJSONString);
					console.log(returnJSON);				
			}
		}
	}
	
	function getMapBean(){
		if(window.ActiveXObject){
			myAjaxObject=new ActiveXObjecr("Microsoft-HTTP");
		}else{
			myAjaxObject=new XMLHttpRequest();
		}
		myAjaxObject.open("get", "mapBean.action?date="+new Date().getTime(),true);
		myAjaxObject.onreadystatechange=returnMapBean;
		myAjaxObject.send();
	}
	
	function returnMapBean(){
		if(myAjaxObject.readyState==4){
			if(myAjaxObject.status==200){
				var returnJSONString=myAjaxObject.responseText;
				console.log(JSON.parse(returnJSONString));
			}
		}
	}
</script>
</head>
<body>
	<input type="button" value="返回List中String类型的JSON" onclick="getListStrng()"/>
	<input type="button" value="返回List中Bean类型的JSON" onclick="getListBean()" />
	<input type="button" value="返回map中String类型的JSON" onclick="getMapString()"  />
	<input type="button" value="返回map中Bean类型的JSON" onclick="getMapBean()"  />
</body>
</html>