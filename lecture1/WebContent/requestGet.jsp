<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- get.jsp 에서 보낸 kg cm를 받아 보겠음 -->
<%
//중요한 개념이 mutable 과 immutable ?  이게 call by value   / call by reference 와 관련이 있음 
// 이 예제는 나중에 list / String 예제 다룰떄 살펴봄
//매개변수로 받아올수 있음
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