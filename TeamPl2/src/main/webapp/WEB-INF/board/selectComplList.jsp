<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String sId=(String)session.getAttribute("SessionUserId");
	//String sName=(String)session.getAttribute("SessionUserName");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>민원글 목록</title>
</head>
<body>
<center>
	<h1>민원 목록</h1>
	<table border="1" cellpadding="0" cellspacing="0" width="800">
		<tr>
			<td bgcolor="green" width="60">글번호</td>
			<td bgcolor="green" width="240">제목</td>
			<td bgcolor="green" width="60">등록일</td>
			<td bgcolor="green" width="40">조회수</td>
			<c:if test="${sessionScope.SessionUserId eq 'admin'}">
				<td bgcolor="green" width="80">삭제</td>
			</c:if>
		</tr>
		
		<c:forEach var="compl" items="${complList}" varStatus="status">
			<tr>
				<td align="center"><a href="selectCompl.do?cNo=${compl.cNo }">${compl.cNo}</a></td>
				<td>
					<c:choose>
						<c:when test="${compl.secret eq'true'}">
							비밀글입니다.
						</c:when>
						<c:otherwise>
							${compl.cTitle}
						</c:otherwise>
					</c:choose>
				</td>
				<td align="center">${compl.cUploadDate}</td>
				<td align="center">${compl.view}</td>
				<c:if test="${sessionScope.SessionUserId eq 'admin'}">
				<td align="center"><a href="deleteCompl.do?cNo=${compl.cNo}">삭제</a></td>
				</c:if>
			</tr>
		</c:forEach>
		<c:forEach var="compl" items="${complList}" varStatus="status">
			<input type="hidden" value="${creplyList[status.index].cNo}">
		</c:forEach>
	</table>
	<br><br>
	<a href="http://localhost:8800/e_sampleWeb/insertCompl.do">민원등록하기</a><br>
	<c:if test="${sessionScope.SessionUserId ne null}">
			로그인함
	</c:if>
	
</center>

</body>
</html>