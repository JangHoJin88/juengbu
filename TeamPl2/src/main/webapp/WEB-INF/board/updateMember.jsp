<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="egovframework.member.service.MemberVO" %>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<center>
<form action="updateMember.do"  method="post">
<input type="hidden" name="uid" value="${member1.uid} "><br>
	<table border="1" cellpadding="0" cellspacing="0">
		비밀번호<br><input type="password" id="pwd" name="pwd" value="${member1.pwd}"><br>
		이름<br><input type="text" id="name" name="name" value="${member1.name}"><br>
		이메일<br><input type="text" id="email" name="email" value="${member1.email}"><br>
		전화번호<br><input type="text" id="phone" name="phone" value="${member1.phone}"><br>
		지역<br><input type="text" id="area" name="area" value="${member1.area}">
		
		<br>
		<input type="submit" value="회원수정완료">
	</table>
</form>
</center>
</body>
</html>