<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String name =(String)request.getAttribute("name");
String text = (String)request.getAttribute("text");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈</title>
</head>
<body>
홈입니다
<div>이름:<%=name %></div>
<div>내용 : <%=text %></div>
</body>
</html>