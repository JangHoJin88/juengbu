<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String sId=(String)session.getAttribute("SessionUserId");
	String sName=(String)session.getAttribute("SessionUserName");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>민원 내용 상세보기</title>
</head>
<body>
<center>
	<h1>민원 내용 상세보기</h1>
		<input name="cNo" type="hidden" value="${compl.cNo}"/>
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="green">제목</td>
				<td align="left"><input name="cTitle" type="text" value="${compl.cTitle}" size="52" readonly></td>
			</tr>
			<tr>
				<td bgcolor="green">민원신청인</td>
				<td align="left"><input name="cWriter" type="text" value="${compl.cWriter}" readonly/></td>
			</tr>
			<tr>
				<td bgcolor="green">민원내용</td>
				<td align="left"><textarea name="cContent" cols="40" rows="5" readonly style="resize: none;">${compl.cContent}</textarea></td>
			</tr>
			<tr>
				<td bgcolor="green">민원신청일</td>
				<td align="left">${compl.cUploadDate}</td>
				
			</tr>
			<tr>
				<c:choose>
					<c:when test="${sessionScope.SessionUserName eq compl.cWriter}">
						<td colspan="2" align="center">
							<button type="button" onclick="location.href='http://localhost:8800/e_sampleWeb/updateCompl.do' ">수정하기</button>
						</td>
					</c:when>
				</c:choose>
			</tr>
	<input name="cNo" type="hidden" value="${creply.cNo}"/>
	<form action="insertReply.do" method="post">
		<input name="cNo" type="hidden" value="${compl.cNo}"/>
			<c:choose>
					<c:when test="${sessionScope.SessionUserName eq '관리자'}">
						<tr>
							<td bgcolor="green">답글내용</td>
							<td align="left"><textarea name="rcontent" cols="40" rows="5" style="resize: none;">${creply.rcontent}</textarea></td>
						</tr>
						<tr>
							<td bgcolor="green">답변작성자</td>
							<td align="left"><input name="rWriter" type="text" value="${sessionScope.SessionUserName} " readonly/></td>
						</tr>
					</c:when>
					<c:otherwise>
						<tr>
							<td bgcolor="green">답글내용</td>
							<td align="left"><textarea name="rcontent" cols="40" rows="5" readonly style="resize: none;">${creply.rcontent}</textarea></td>
						</tr>
						<tr>
							<td bgcolor="green">답변작성자</td>
							<td align="left"><input name="rWriter" type="text" value="${creply.rWriter}" readonly></td>
						</tr>
					</c:otherwise>
				</c:choose>
			<tr>
				<td bgcolor="green">답변작성일</td>
				<td align="left">${creply.rUpLoadDate}</td>
			</tr>
			<tr>
				<c:choose>
					<c:when test="${sessionScope.SessionUserId eq 'admin'}">
						<td colspan="2" align="center">
							<input type="submit" value="INSERT">
						</td>
					</c:when>
				</c:choose>
			</tr>
		</table>
	</form>
	<br><br>
	<a href="selectCompl.do?cNo=${compl.cNo-1}">이전글</a>
	<a href="selectCompl.do?cNo=${compl.cNo+1}">다음글</a>
	<br><br>
	<a href="selectComplList.do">LIST</a>	
</center>
</body>
</html>