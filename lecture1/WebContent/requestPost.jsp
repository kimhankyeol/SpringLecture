<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//매개변수로  받아올수있음
out.println(request.getParameter("kg"));
out.println(request.getParameter("cm"));
String kg=request.getParameter("kg");
String cm=request.getParameter("cm");
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><%=kg %></div>
<div><%=cm %></div>
</body>
</html>