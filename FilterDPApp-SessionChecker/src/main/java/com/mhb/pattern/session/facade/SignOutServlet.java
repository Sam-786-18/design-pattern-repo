package com.mhb.pattern.session.facade;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/signouturl")
public class SignOutServlet extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	HttpSession ses=null;
	RequestDispatcher rd=null;
	//get Access Session 
	ses=req.getSession(false);
	ses.invalidate();
	//forward request to login page
	rd=req.getRequestDispatcher("/login.jsp");
	rd.forward(req, resp);
	System.out.println("SignOutServlet");
}
}
