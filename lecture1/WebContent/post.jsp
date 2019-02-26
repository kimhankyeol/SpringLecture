<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- post 방식 
get 과 post 의 차이는 url 뒤를 확인해보면됨
그리고 form 형식으로도 get 방식 됨
-->
 <form action="requestPost.jsp" method="post">
	<input type="text" name="kg">몸무게
	<input type="text" name="cm">키
	<input type="submit" name="전송">
</form>

<!-- 페이지 이동방법  
forward  / redirect 
   -->
<form action="forward.jsp" method="post">
 <input type="text" name="kg">몸무게
	<input type="text" name="cm">키
	<input type="submit" name="전송">
</form>
</body>
</html>