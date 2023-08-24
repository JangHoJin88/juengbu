<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
</head>
<body>
<center>
<h1>insert</h1>
<form action="insertMenu.do" method="post">
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td bgcolor="white" width="70">글번호</td>
		<td align="left"><input name="mNo" type="text" size="52" value="${menuVO.mNo }"/></td>
	</tr>
	<tr>
		<td bgcolor="white" width="70">작성자</td>
		<td align="left"><input name="id" type="text" size="52" value="${menuVO.id }"/></td>
	</tr>
	<tr>
		<td bgcolor="white" width="70">이미지url</td>
		<td align="left"><input name="mImage" type="text" size="52" value="${menuVO.mImage }"/></td>
	</tr>
	<tr>
		<td bgcolor="white">년도</td>
		<td align="left"><input name="mYear" type="text" size="10" value="${menuVO.mYear }"/></td>
	</tr>	<tr>
		<td bgcolor="white">월</td>
		<td align="left"><input name="month" type="text" size="10" value="${menuVO.month }"/></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="INSERT"/>
		</td>
	</tr>
</table>
</form>
<br>
<a href="selectMenuList.do">LIST</a>
</center>



</body>
</html>