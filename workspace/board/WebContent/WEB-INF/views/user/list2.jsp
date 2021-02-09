<%@page import="kr.co.multi.board.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>회원목록보기!</h1>
<table>
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>비밀번호</th>
		<th>이메일</th>
		<th>가입일</th>
	</tr>
	<c:forEach var="user" items="${userList}">
	<tr>
		<td>${user.id}</td>
		<td>${user.name}</td>
		<td>${user.password}</td>
		<td>${user.email}</td>
		<td>${user.joinDate}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>