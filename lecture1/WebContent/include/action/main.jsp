<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 헤더 변수-->
<!-- f12 눌러서 확인 directive와 차이 -->
<jsp:include page = "header.jsp" flush="true" />
<!-- 변수를 받아오는 예제 -->
<%String title= request.getParameter("title");%>
<div>header.jsp에서 가져온 변수 : <%=title%> </div>

<!--  메인 -->
<div>
--------------------
메인 입니다 
--------------
</div>
</body>
</html>