package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//응답  콘텐트 타입  화면 보여줄때 charset
		resp.setContentType("text/html; charset=UTF-8");
		//요청 인코딩을 UTF-8
		req.setCharacterEncoding("utf-8");
		System.out.println("들어왔십까");
		// 여기서는 디비와의 연결을 통해 데이터를 받아온다. 
		//이거는 Spring 프로젝트 설명할떄
		
		//페이지에 보낼 데이터
		String name = "김한결";
		String text = "화이팅";
		
		//데이터를 담아서 내가 원하는 페이지에 보내줘야함  //이떄 객체에 담긴다. 라는점
		req.setAttribute("name", name);
		req.setAttribute("text", text);
		
		PrintWriter out = resp.getWriter();
		//dispatcher 라는것을 나중 시간에 dispatcher xml 파일로 보게 될거임 .. 이게 모든 웹요청의 진입점 역할을 하게됨
		RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
		dispatcher.forward(req,resp);
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
