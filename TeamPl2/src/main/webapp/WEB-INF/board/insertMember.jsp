<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="../common/header.jsp"%>
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
	
	$("#btn_idcheck").click(function(){
		var uid = $.trim($("#uid").val());
		if(uid==""){
			alert("아이디를 입력하세요");
			$("#uid").focus();
			return false;
		}
		//idcheck.do로 데이터 전송
		$.ajax({
			/*전송 전*/
			type:"POST",
			data:"uid="+uid,  //json
			url:"idcheck.do",
			dataType:"text",
			
			/*전송 후*/
			
			success:function(result){
				if(result=="ok"){
					alert("사용가능한 아이디입니다.");
				}else{
					alert("이미 존재하는 아이디입니다.");
				}
			},
			error:function(){
				alert("오류발생");
			}
		})
		
	});
	
	
	$("#btn_submit").click(function(){
		
		var uid = $("#uid").val();
		var pwd = $("#pwd").val();
		var email = $("#email").val();
		var name= $("#name").val();
		var phone = $("#phone").val();
		var area = $("#area").val();
		
		uid=$.trim(uid);
		pwd=$.trim(pwd);
		name=$.trim(name);
		email=$.trim(email);
		phone=$.trim(phone);
		area=$.trim(area);
		
		
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
		if(name==""){
			alert("이름을 입력하세요");
			$("#name").focus();
			return false;
		}
		if(email==""){
			alert("이메일을 입력하세요");
			$("#email").focus();
			return false;
		}
		if(phone==""){
			alert("전화번호를 입력하세요");
			$("#phone").focus();
			return false;
		}
		if(area==""){
			alert("지역을 입력하세요");
			$("#area").focus();
			return false;
		}
		$("#uid").val(uid);
		$("#pwd").val(pwd);
		$("#email").val(email);
		$("#phone").val(phone);
		$("#area").val(area);
		
		var formData=$("#frm").serialize();
		
		$.ajax({
			
			/*전송 전 세팅*/
			type:"POST",
			data:formData,
			url:"insertMember.do",
			dataType:"text",
			
			/*전송 후 세팅*/
			success:function(result){
				if(result=="ok"){
					alert("성공");
					location="index.do";
				}else{
					
				}
			},
			error:function(){
				alert("오류");
			}
		});
		
		});
	});
	
	

</script>
<meta charset="UTF-8">
</head>
<body>
<center>
<div id="form">
<form id="frm">
	<caption>회원가입</caption>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th><label for="uid">아이디</label></th>
			<td>
				<input type="text" id="uid" name="uid" >
				<button type="button" id="btn_idcheck">중복체크</button>
			</td>
		</tr>
		<tr>
			<th><label for="pwd">비밀번호</label></th>
			<td><input type="password" id="pwd" name="pwd"></td>
		</tr>
		<tr>
			<th><label for="name">이름</label></th>
			<td><input type="text" id="name" name="name"></td>
		</tr>
		<tr>
			<th><label for="email">이메일</label></th>
			<td><input type="email" id="email" name="email"></td>
		</tr>
		<tr>
			<th><label for="phone">전화번호</label></th>
			<td><input type="text" id="phone" name="phone"></td>
		</tr>
		<tr>
			<th><label for="area"></label>지역</th>
			<td><input type="text" id="area" name="area"></td>
		</tr>
	</table>
		<button type="button" id="btn_submit">회원가입완료</button>
		<button type="reset">취소</button>
</form>
</div>
</center>
</body>
</html>
<%@ include file="../common/footer.jsp"%>