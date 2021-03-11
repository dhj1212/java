<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<base href="<%=com.hpi.util.Util.getInstance().getBaseUrl(request)%>" target="_self">
<link rel="stylesheet" type="text/css" href="css/indexmain.css" />
<jsp:directive.page import="org.apache.commons.logging.Log"/>
<jsp:directive.page import="org.apache.commons.logging.LogFactory"/>
<html>
<%
Log log = LogFactory.getLog(getClass());
StringBuffer errormsg=new StringBuffer();
StringBuffer msg=new StringBuffer();
if(request.getAttribute("errMSG")!=null&&!"".equals(request.getAttribute("errMSG")))
	msg.append((String)request.getAttribute("errMSG"));

if(request.getAttribute("errorMSG")!=null&&!"".equals(request.getAttribute("errorMSG")))
	msg.append((String)request.getAttribute("errorMSG"));

if(request.getAttribute("errmsg")!=null&&!"".equals(request.getAttribute("errmsg")))
	msg.append((String)request.getAttribute("errmsg"));

if(request.getAttribute("error")!=null&&!"".equals(request.getAttribute("error")))
	msg.append((String)request.getAttribute("error"));
if(errormsg==null) errormsg=new StringBuffer();
log.error("系统出错捕获的异常信息＝"+errormsg.toString());
log.error("系统出错捕获的异常请求URL＝"+request.getRequestURI()+request.getQueryString());

if(errormsg!=null&&errormsg.indexOf("ORA-00001")!=-1)
msg.append("您添加的信息在数据库中已经存在了，不能重复提交！");
if(errormsg!=null&&errormsg.indexOf("ORA-02292")!=-1)
msg.append("不能对该数据进行删除操作，数据库中有关联该数据的子记录信息！");
if(errormsg!=null&&errormsg.indexOf("OutOfMemoryError")!=-1)
msg.append("数据量过大，超出了最大数据提取范围！");

if(errormsg!=null&&errormsg.indexOf("Could not open Hibernate Session")!=-1)
{
msg.append("网络繁忙，请稍后再试！");
}
if(msg==null||msg.length()<2)
msg.append("由于网络或其它不可预料的原因，本次操作没有成功，重试无效后联系管理员！");
%>
<body>
		<center>
			<table  align="center" valign="middle" border="0" cellspacing="0" cellpadding="0" 
				style="height:180px;margin-top:-90px;top:50%;position: absolute;left:50%;margin-left:-120px;width:240px;" >
				
				<tr>
                  <td width="5%" align="left"><img src="images/error.gif"></td>
                  <td width="100px" align="left" ></td>
				  <td width="95%" align="left"><%=msg%></td>
			  	</tr>
				<tr>
<%--											<td colspan="2" align="center"><input name="Submit" type="button" class="button2" value=" 返 回 " onClick="javascript:history.back(1);"/></td>--%>
				</tr>		
			</table>
		</center>
	</body>
</html>