<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="../common/header.jsp"%>
<%
	String sId=(String)session.getAttribute("SessionUserId");
%>
<style>
#form{
	border:1px solid ;
	padding:100px;
}
#form table{
	width:600px;
	border-collapse:collapse;
}
#form table th,td{
	border:1px solid #cccccc;
	padding:3px;
}
</style>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$( function() {
	
	$("#btn_submit").click(function(){
		
		var uid = $("#uid").val();
		var pwd = $("#pwd").val();
		
		uid=$.trim(uid);
		pwd=$.trim(pwd);
		
		if(uid==""){
			alert("아이디를 입력하세요");
			$("#uid").focus();
			return false;
		}
		if(pwd==""){
			alert("비밀번호를 입력하세요");
			$("#pwd").focus();
			return false;
		}
		
		$("#uid").val(uid);
		$("#pwd").val(pwd);
		
		
		var formData=$("#frm").serialize();
		
		$.ajax({
			
			/*전송 전 세팅*/
			type:"POST",
			data:"uid="+uid+"&pwd="+pwd,
			url:"loginWriteSub.do",
			dataType:"text",
			
			/*전송 후 세팅*/
			success:function(result){
				if(result=="ok"){
					location="homePage.do";
				}else{
					alert("로그인정보를 다시 확인해주세요");
				}
			},
			error:function(){
				alert("오류");
			}
		});
		
		});
	});
	$("btn_insertMember").click(function(){
		 window.location.href ="http://localhost:8800/e_sampleWeb/insertMember.do";
	});
	

</script>
<meta charset="UTF-8">
</head>
<body>
<center>
<div id="form">
<form id="frm">
	<caption>로그인</caption>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th><label for="uid">아이디</label></th>
			<td>
				<input type="text" id="uid" name="uid" >
			</td>
		</tr>
		<tr>
			<th><label for="pwd">비밀번호</label></th>
			<td><input type="password" id="pwd" name="pwd"></td>
		</tr>
		
	</table>
		<button type="button" id="btn_submit">로그인</button>
		<button type="reset">취소</button>
		<button type="button" onclick="location.href='http://localhost:8800/e_sampleWeb/insertMember.do' ">회원가입</button>
</form>
</div>
</center>
		<c:if test="${sessionScope.SessionUserId ne null}">
			<script>
				location.href="http://localhost:8800/e_sampleWeb/homePage.do";
			</script>
		</c:if>
</body>
</html>
<%@ include file="../common/footer.jsp"%>