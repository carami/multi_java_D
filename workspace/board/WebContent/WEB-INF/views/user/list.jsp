<%@page import="kr.co.multi.board.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% List<User> userList = (List<User>)request.getAttribute("userList"); %>

<h1>회원목록보기!</h1>
<table>
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>비밀번호</th>
		<th>이메일</th>
		<th>가입일</th>
	</tr>
<%for(int i = 0; i < userList.size(); i++){ 
	User user = userList.get(i);
%>
	<tr>
		<td><%= user.getId()%></td>
		<td><%= user.getName()%></td>
		<td><%= user.getPassword()%></td>
		<td><%= user.getEmail()%></td>
		<td><%= user.getJoinDate()%></td>
	</tr>
<%} %>
</table>
</body>
</html>