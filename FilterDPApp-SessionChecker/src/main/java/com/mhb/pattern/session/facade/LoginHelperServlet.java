package com.mhb.pattern.session.facade;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mhb.pattern.dto.UserDetails;
@WebServlet("/loginurl")
public class LoginHelperServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=null,pwd=null;
		UserDetails details=null;
		HttpSession ses=null;
		RequestDispatcher rd=null;
		// read form data
		uname=req.getParameter("uname");
		pwd=req.getParameter("pwd");
		//verify uname and password
		if(uname.equalsIgnoreCase("satish")&& pwd.equalsIgnoreCase("arti"))
		{
			//place username ,password in UserDetails obj
			details=new UserDetails();
			details.setUser(uname);
			details.setPwd(pwd);
			//keep crendential in session
			ses=req.getSession(true);
			ses.setAttribute("credentials", details);
			System.out.println("credentials "+details.getUser()+" pwd "+ses.getId());
			//froward request to InboxServlet
			rd=req.getRequestDispatcher("inboxurl");
			rd.forward(req, resp);
			System.out.println("-------------Loginhelper------------");
			
		}
		else
			req.setAttribute("errorMsg", "Invalid Creandentials");
		rd=req.getRequestDispatcher("loginurl");
		rd.forward(req, resp);
	
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
