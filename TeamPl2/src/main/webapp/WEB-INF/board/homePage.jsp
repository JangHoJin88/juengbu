<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String sId=(String)session.getAttribute("SessionUserId");

%>
<c:set var="sId" value="<%=sId%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<c:if test="${sessionScope.SessionUserId eq null}">
			<a href="http://localhost:8800/e_sampleWeb/loginWrite.do">로그인</a><br>
			<a href="http://localhost:8800/e_sampleWeb/insertMember.do">회원가입</a><br>
		</c:if>
		<c:if test="${sessionScope.SessionUserId ne null}">
			<a href="http://localhost:8800/e_sampleWeb/logout.do">로그아웃</a><br>
			<a href="http://localhost:8800/e_sampleWeb/selectComplList.do">게시판</a><br>
		</c:if>
	
</body>
</html>