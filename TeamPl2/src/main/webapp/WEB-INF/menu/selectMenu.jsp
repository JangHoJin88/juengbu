<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="egovframework.menu.service.impl.MenuDAOIBatis" %>
<%@ page import="egovframework.menu.service.MenuVO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu 상세</title> 
</head>
<body>
<center>
	<h1>Menu 상세</h1>
		<form action="updateMenu.do" method="post">
		<input name="mNo" type="hidden" value="${menu.mNo }">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">작성자</td>
					<td align="left"><input name="id" type="text" value="${menu.id }" disabled="disabled"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">이미지Url</td>
					<td align="left"><input name="mImage" type="text" value="${menu.mImage }" size="52"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">작성일</td>
					<td align="left">${menu.mUploadDate }</td>
				</tr>
				<tr>
					<td bgcolor="orange">수정일</td>
					<td align="left">${menu.mUpdateDate }</td>
				</tr>
				<tr>
					<td bgcolor="orange">년도</td>
					<td align="left"><input name="mYear" type="text" value="${menu.mYear }" size="52"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">월</td>
					<td align="left"><input name="month" type="text" value="${menu.month }" size="52"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">추천수</td>
					<td align="left">${menu.mLike }</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="UPDATE"/></td>
				</tr>
				
			
			</table>
		
		</form>
		<br> 
		<a href="insertMenu.do">INSERT</a>&nbsp;&nbsp;&nbsp;
		<a href="deleteMenu.do?id=${menu.mNo }">DELETE</a> &nbsp;&nbsp;&nbsp;
		<a href="selectMenuList.do">LIST</a>
</center>
</body>
</html>