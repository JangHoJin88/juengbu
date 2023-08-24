<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="egovframework.member.service.MemberVO" %>
<%@ page import="java.util.List" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="list.mainTitle"/></title>
</head>
<body>
<center>

<a href="ListBoard.do?lang=en">
	<spring:message code="list.link.locale.en"/></a>&nbsp;&nbsp;&nbsp;
	
<a href="ListBoard.do?lang=ko">
	<spring:message code="list.link.locale.ko"/></a>&nbsp;&nbsp;&nbsp;
<h1><spring:message code="list.mainTitle"/></h1>




<table border="1" cellpadding="0" cellspacing="0" width="800">
<tr>
	<th width="30"><spring:message code="list.list.table.id"/></th>
	<th width="60"><spring:message code="list.list.table.title"/></th>
	<th width="60"><spring:message code="list.list.table.regUser"/></th>
	<th width="60"><spring:message code="list.list.table.regDate"/></th>
</tr>
<c:forEach var="member" items="${memberList}">

<tr>
	<td align="center"><a href="selectMember.do?uid=${member.uid}">${member.uid}</td>
	<td align="center">${member.name}</td>
	<td align="center">${member.pwd}</td>
</tr>
</c:forEach>
</table>
</center>
</body>
</html>