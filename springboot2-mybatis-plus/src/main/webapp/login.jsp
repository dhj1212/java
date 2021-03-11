<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head> 
<%--<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />--%>
<%--<base href="<%=com.hpi.util.Util.getInstance().getBaseUrl(request)%>" target="_self">--%>
<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" />
<script language=javascript src="js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-easyui-1.4.5/jquery.min.js"></script></head>
<script language=javascript>contextPath="${pageContext.request.contextPath}";</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>欢迎使用EPM管理系统</title>
<SCRIPT LANGUAGE="JavaScript">
function killerrors(){return true;}
	window.onerror=killerrors;
	window.status="欢迎使用EPM管理系统";
	$(document).keyup(function(event){
	  if(event.keyCode ==13){
		  var isFocus=$("#tbUser").is(":focus"); 
		  if(true !=isFocus){  
			  dologin();
		  }  
		  //dologin();
	  }
	});
	
	if (top.location !== self.location) { 
		top.location=self.location; 
	} 
	
	function dologin() {
	    if(chkblank(loginform.loginid.value)==0) {
	    	alert("请输入用户名！");
	        loginform.loginid.focus();
	    } else {
			if(chkblank(loginform.password.value)==0) {
		    	alert("请输入密码！");
		        loginform.password.focus();
		    } else{
		    	loginform.action="${pageContext.request.contextPath}/login.do?method=login";
	          	loginform.submit();	
		   /* } else {
			   	if (chkblank(loginform.code.value)==0) {
			   		alert("请填写验证码");
			   		loginform.code.focus();
			   	} else {
			   		var url="${pageContext.request.contextPath}/login.do?method=validateCode";
			   		var code = $("#code").val();
			   		$.ajax({
						type: "POST",
				   		url: url,
				   		data: { code: code },
				   		success: function(d){
				   			var json = $.parseJSON(d);
				        	if (json.success){
				        		loginform.action="${pageContext.request.contextPath}/login.do?method=login";
					          	loginform.submit();	
				            } else {
				            	alert(json.msg);
				            	$("#code").val("");
					            loadimage();
				            }
				   		}
					});
			   	}*/
		    }      
		}
	}
	function loadimage(){ 
    	var path="${pageContext.request.contextPath}/login.do?method=verifyCode&&"+Math.random();
    	$("#randImage").attr('src',path); 
    }
	function dorest() {
		loginform.loginid.value='';
		loginform.password.value='';
	}
	function doonload() {
		loginform.loginid.focus();
	}
	function dokey() {
		if(event.keyCode==13) {
			dologin();
		}
	}    
	function doreset() {
		loginform.loginid.value="";
		loginform.password.value="";
		loginform.loginid.focus();
	}

</SCRIPT>
<%
  String msg=(String)request.getAttribute("loginMSG");
//out.println(msg);
  if(msg!=null&&"failure".equals(msg))
  {
%>
<script language="javascript">
//<!--
	alert("用户名或密码不正确，或者登陆已超时！");
//-->
</script>
<%
  } else {
    if(msg!=null&&!"".equals(msg)) {
%>
<script language="javascript">
//<!--
	alert("<%=msg%>");
//-->
</script>
<%} }%>

<BODY>
<form name="loginform" method="post" action="login.do?method=login">

<div class="loginbg">
<div class="login">
<%--<div class="logintitle"></div>--%>
<div style="height:39px"></div>
<div class="loginarea">
<div class="logininput">
<div class="userinput"><ul><li style="width:60px">用户名：</li><li><input name="loginid"  type="text" value="admin" id="tbUser" autofocus="autofocus" style="background-color: rgb(250, 255, 189); border: 1px solid #CECECE; float: left;width:150px;height:22px; onkeydown="dokey();" /></li></ul></div>
<div class="userinput" style="height:50px"><ul><li style="width:60px; ">密&nbsp;&nbsp;&nbsp;码：</li><li><input name="password" style="background-color: rgb(250, 255, 189); border: 1px solid #CECECE; float: left;width:150px;height:22px; " type="password" id="tbPwd" value="123456" onkeydown="dokey();" /></li></ul></div>
<div class="userinput">

<%--	<ul><li style="width:60px; ">验证码：</li><li>--%>
<%--	<input  style="background-color: rgb(250, 255, 189); border: 1px solid #CECECE; float: left;width:70px;height:22px; " type="text" name="code" id="code" />--%>
<%--	  <img  alt="看不清点我" name="randImage" id="randImage" src="${pageContext.request.contextPath}/login.do?method=verifyCode" width="61px" height="27px" border="3" style="position:relative; left:15px " onclick="javascript:loadimage();" />--%>
<%--	  </li>--%>
<%--	</ul>--%>
</div><div class="button"><ul><li><a href="javascript:dologin();" class="myButton"  >登 陆</a></li><li><a href="javascript:doreset();" class="myButton">重 置</a></li></ul></div>
</div>

</div>
</div>
</div>


</form>
</BODY>
</HTML>