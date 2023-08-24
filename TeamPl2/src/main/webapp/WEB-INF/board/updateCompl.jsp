<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%
	String sId=(String)session.getAttribute("SessionUserId");
	String sName=(String)session.getAttribute("SessionUserName");
%>    
<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
 $(function(){
	 $("#secret").change(function(){
		 if(this.checked){
			 $(this).prop('Value','Y');
		 }else{
			 $(this).prop('Value','N');
		 }
	 });
       
 }); 

</script>
<head>
<meta charset="UTF-8">
<title>건의사항 등록</title>
</head>
<body>
<center>
	<h1>건의사항 수정</h1>
	
	<form action="updateCompl.do" method="post">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="green" width="70">제목</td>
				<td align="left"><input name="cTitle" type="text" size="52" value="${compl.cTitle}"></td>
			</tr>
			<tr>
				<td bgcolor="green">작성자</td>
				<td align="left"><input name="cWriter" type="text" size="10" value="${sessionScope.SessionUserName}" readonly></td>
			</tr>
			<tr>
				<td bgcolor="green">건의사항내용</td>
				<td align="left"><textarea name="cContent" cols="40" rows="5">${compl.cContent}</textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="UPDATE">
				</td>
				<td colspan="2" align="center">
					<button type="button" onclick="location.href='http://localhost:8800/e_sampleWeb/deleteCompl.do?cNo=${compl.cNo}' ">delete</button>
				</td>
			</tr>
		</table>
	<div class="form-check form-check-inline mt-3">
		<c:choose>
			<c:when test="${compl.secret eq true}">
				<input class="form-check-input" type="checkbox" name="secret" id="secret" checked>
			</c:when>
			<c:otherwise>
				<input class="form-check-input" type="checkbox" name="secret" id="secret">
			</c:otherwise>
		</c:choose>
		<label class="form-check-label">비밀글 설정</label>
	</div>
	
	</form>
	<a href="selectComplList.do">민원 목록으로</a>
</center>

<c:choose>
	<c:when test="${sessionScope.SessionUserId eq null}">
		<script>
			alert("로그인 해주세요.");
			location.href="http://localhost:8800/e_sampleWeb/loginWrite.do";
		</script>
	</c:when>
	
</c:choose>
</body>
</html>