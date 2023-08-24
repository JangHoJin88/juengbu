<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="list.link.create"/></title>
</head>
<body>
<center>
<a href="ListBoard.do?lang=en">
	<spring:message code="list.link.locale.en"/></a>&nbsp;&nbsp;&nbsp;
	
<a href="ListBoard.do?lang=ko">
	<spring:message code="list.link.locale.ko"/></a>&nbsp;&nbsp;&nbsp;

<h1><spring:message code="list.link.create"/></h1>
<form action="insertBoard.do"  method="post">
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td width="70"><spring:message code="list.search.title"/></td>
			<td align="center"><input name="title" type="text"  size="52" required/>
			</td>
		</tr>
		<tr>
			<td width="70"><spring:message code="list.list.table.regUser"/></td>
			<td align="center"><input name="regUser" type="text"  size="52" required/>
			</td>
		</tr>
		<tr>
			<td width="70"><spring:message code="list.search.condition"/></td>
			<td align="center"><input name="content" type="text"  size="52" required/>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="<spring:message code="list.link.done"/>">
			</td>
		</tr>
	</table>
</form>
<br>
<a href="ListBoard.do"><spring:message code="list.mainTitle"/></a>
</center>
</body>
</html>