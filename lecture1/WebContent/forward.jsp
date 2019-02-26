<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 여기서는 다른 페이지로 이동 해줄거임  / redirect 와의 차이를 봐야 쉬움 -->
<!-- post.jsp 에서 forward.jsp 매개변수를 2개 보냄 kg cm  -->
<%
//여기서 String 형으로 받으면 어떻게 될까 ?
/*
String cm = request.getParameter("cm");
String kg = request.getParameter("kg");
*/
//답 
int cm = Integer.parseInt(request.getParameter("cm"));
int kg = Integer.parseInt(request.getParameter("kg"));

double bmi= kg/((cm*0.01)*(cm*0.01));

//이제 구한 결과값을 저장해서 result.jsp 페이지에 보내줘야함 /
//request 객체에 setAttribute 라는 메소드를 사용해서  bmi 를 보낼것임
request.setAttribute("bmi", bmi);

//페이지에서 페이지 이동하는 방식
//forward 방식

RequestDispatcher rd = request.getRequestDispatcher("result.jsp");//result.jsp 에다가 전송
//result.jsp 페이지로 넘기면서 내장객체인 request , response 정보를 넘김
rd.forward(request, response);


//redirect  페이지 이동을 해도 데이터를 넘기지 않음

//response.sendRedirect("result.jsp"); //회원약관

//내장객체
//1.request 
//2.pageContext
//3.response
//4.out

//여기서 보는 dispatcher 가 dispatcher .xml 이랑 비슷한거임 
// 모든 요청이 들어오면 dispatcher  에서 먼저 받음 그런다음 설정된것으로 처리함

%>