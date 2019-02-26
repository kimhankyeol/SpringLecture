<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//여기다가 자바를 작성하면됨
	//이곳을 스크립트릿 
	//System.out.println("hello world"); // sysout  대신  log 를 쓰는것이 좋음  
	// 그이유는 sysout 도 프로그램이 실행시 하나의 쓰레드로 같이 동작하는 방식으로 sysout 이 많아질수록 안좋음 - 다른분께 설명을 들어본걸 말하자면  - 그래픽 카드 - 모니터 까지 가서 출력 하는거라 성능상의 문제가 있음
	//하지만 우리가 logger  log 를 이용하면 다른 쓰레드로 동작 하기 떄문에 문제없음
	
	//jsp 에서 화면에 출력하는 방법은 여러가지 크게 2가지를 보면
	//1. out.println();// 이안에다가 태그 입력할수 있음
	//2.<%= out.println("hello world <br/>") % >  
	//
	
%>
<!-- 화면에 출력되는 부분 -->
<!--< %="hello world1"% >   -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>a</title>
</head>
<body>

<!-- 자바문법을 어떻게 쓰는지 - 혼합  -->
<% for(int i = 1 ; i<7 ; i++){ %>
김한결 의 번호는 <%=i %> 입니다.<br />
<h<%=i %>> h<%=i %> 크기 입니다.</h<%=i %>>
<%} %>


<!-- 테이블에 1~10 까지 출력 2의 배수만 출력해라 -->
<table>
	<% for (int i = 1; i <= 10; i++) {%>
		<% if (i % 2 == 0) {%>
		<tr>
			<td><%=i%></td>
		<%}%>
		</tr>
	<%}%>
</table>
<!-- 테이블을 이용하여 1부터 100까지 출력 -->
<table>
	<% for (int i = 1; i <= 100; i++) {%>
	<tr>
		<td><%=i%></td>
	</tr>
	<%}%>
</table>
<!--테이블을 이용해 구구단 출력 -->
<table border='1'>
	<% for (int i = 2; i <= 9; i++) {%>
	<tr>
		<% for (int j = 1; j <= 9; j++) {%>
		<td><%=i + "*"%><%=j + "="%><%=i * j%></td>
		<%}%>
	</tr>
	<%}%>
</table>
</body>
</html>