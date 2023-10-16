package com.example.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ReponseServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>response sample</title></head>");
		out.println("<body>");
		out.println("<h1>리스폰 예제 페이지</h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}
