package com.mhb.pattern.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//@WebFilter("/inboxurl")
public class SessionCheckerFilter implements Filter {
	
@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpSession ses=null;
		RequestDispatcher rd=null;
		try{
		//get Access to session
		ses=((HttpServletRequest)request).getSession();
		//check user is logged or not
		if(ses!=null && ses.getAttribute("credentials")!=null)
		{
			
			
			System.out.println("------if---------");
			chain.doFilter(request, response);
		
		}
		else
		{
			System.out.println("-----else-----------");
			request.setAttribute("errorMsg", "U r not a Logged in user");
			//forward request to login page
			rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		}
		catch(ServletException se)
		{
			System.out.println("-----------sessionchecker------------");
			se.printStackTrace();
		}
		catch(Exception ex)
		{
			
		}

	}

@Override
public void init(FilterConfig filterConfig) throws ServletException {
	// TODO Auto-generated method stub
	
	System.out.println("init");
}

@Override
public void destroy() {
	// TODO Auto-generated method stub
	System.out.println("destroy()");
	
}



}
