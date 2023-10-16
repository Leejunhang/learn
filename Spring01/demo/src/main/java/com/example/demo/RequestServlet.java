package com.example.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RequestServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		System.out.println("Request URI : " + request.getRequestURL()); // 요청 URL
		
		System.out.println("Request Method : " + request.getMethod()); // 요청 메소드
	
		// 모든 파라미터들의 이름과 값
		for(String paramName : request.getParameterMap().keySet()) {
			String[] paramValues = request.getParameterValues(paramName);
			for (String value : paramValues) {
				System.out.println("Name : " + paramName + ", Value : " + value);
			}
		}
		
		// 모든 헤더들의 이름과 값
		java.util.Enumeration<String> headerNames = request.getHeaderNames();

		while(headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			System.out.println("Header Name : " + headerName + ", Value : " + request.getHeader(headerName));
		}
		
		//쿠키 정보를 출력
		Cookie[] cookies = request.getCookies();
				
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				System.out.println("Cookie Name : " + cookie.getName() + ", Value : " + cookie.getValue());
			}
		}
	}
}
