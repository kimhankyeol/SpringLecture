<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- forward.jsp 에서 내장객체에 저장된 bmi 를 꺼내겠음 -->
<% 
out.println(request.getAttribute("bmi"));
//내장 객체 형태로 저장되어 왔기 떄문에 Object 형식일거임 이것을 형변환 해주면됨
double bmi = (double) request.getAttribute("bmi");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>