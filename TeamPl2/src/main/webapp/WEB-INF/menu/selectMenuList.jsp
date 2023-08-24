<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu List</title>
</head>
<body>
<center>
	<h1>메뉴 리스트</h1>
	
	<table border="1" cellpadding="0" cellspacing="0" width="800">
		<tr>
			<th bgcolor="orange" width="60">글번호</th>
			<th bgcolor="orange" width="240">작성자</th>
			<th bgcolor="orange" width="40">이미지</th>
			<th bgcolor="orange" width="60">작성일</th>
			<th bgcolor="orange" width="60">수정일</th>
			<th bgcolor="orange" width="60">년도</th>
			<th bgcolor="orange" width="60">월</th>
			<th bgcolor="orange" width="60">추천수</th>
		</tr>
		<c:forEach var="menu" items="${menuList }">
		<tr>
			<td align="center"><a href="selectMenu.do?id=${menu.mNo }">${menu.mNo }</a></td>
			<td align="center"><a href="selectMenu.do?id=${menu.mNo }">${menu.id }</td>
			<td align="center">${menu.mImage }</td>
			<td align="center">${menu.mUploadDate }</td>
			<td align="center">${menu.mUpdateDate }</td>
			<td align="center">${menu.mYear }</td>
			<td align="center">${menu.month }</td>
			<td align="center">${menu.mLike }</td>		
		</tr>
		</c:forEach>
		
	</table>
	<br>
	<a href="insertMenu.do">입력</a>
</center>
</body>
</html>