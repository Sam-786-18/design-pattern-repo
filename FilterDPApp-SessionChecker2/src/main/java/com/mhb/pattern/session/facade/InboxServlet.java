package com.mhb.pattern.session.facade;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/inboxurl")
public class InboxServlet extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	PrintWriter pw=null;
	//general settings
	pw=resp.getWriter();
	resp.setContentType("text/html");
	//display response
	pw.println("<h1 style='color:red;text-align:center'>INBOX PAGE<h1>");
	
	pw.println("<a href='signouturl'>signout</a>");
	pw.close();
	System.out.println("-----------InboxServlet------------");
}
@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
