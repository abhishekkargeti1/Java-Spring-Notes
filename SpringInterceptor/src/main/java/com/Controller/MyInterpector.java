package com.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterpector extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
		System.out.println(uri);
		System.out.println("Hello I am PreHandler");
		String name =request.getParameter("username");
		if(name.startsWith("a")) {
			response.setContentType("text/html");
			response.getWriter().println("<h1>Invalid Name . Name should Not start with A</h1>");
			response.sendRedirect("form");
			return false;
		}
		return true;
	}
	
	

}
