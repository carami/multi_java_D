<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입폼</h1>
	<form action="join" method="post">
		<table>
			<tr>
				<td>이름:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>아이디:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>이메일:</td>
				<td><input type="email" name="email"></td>
			</tr>
		</table>
		<input type="submit" value="Submit">
	</form>
</body>
</html>