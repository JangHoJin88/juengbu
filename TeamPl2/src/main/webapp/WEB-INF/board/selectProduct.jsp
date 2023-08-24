<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="egovframework.product.service.ProductVO" %>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="list.list.table.info"/></title>
</head>
<body>
<center>
<a href="ListBoard.do?lang=en">
	<spring:message code="list.link.locale.en"/></a>&nbsp;&nbsp;&nbsp;
	
<a href="ListBoard.do?lang=ko">
	<spring:message code="list.link.locale.ko"/></a>&nbsp;&nbsp;&nbsp;
<h1><spring:message code="list.list.table.info"/></h1>
<form action="updateProduct.do"  method="post">
<input type="hidden" name="pno" value="${product.pno}">
	<caption>상품수정</caption>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th><label for="pname">상품명</label></th>
			<td>
				<input type="text" id="pname" name="pname" value="${product.pname}">
			</td>
		</tr>
		<tr>
			<th><label for="price">가격</label></th>
			<td><input type="text" id="price" name="price"value="${product.price}"></td>
		</tr>
		<tr>
			<th><label for="pcontent">상품설명</label></th>
			<td><input type="text" id="pcontent" name="pcontent"value="${product.pcontent}"></td>
		</tr>
		<tr>
			<th><label for="pcode">상품코드</label></th>
			<td><input type="text" id="pcode" name="pcode"value="${product.pcode}"></td>
		</tr>
		
	</table>
		<input type="submit" value="상품수정">
</form>
<br>
</center>
</body>
</html>