package com.mhb.pattern.dispacher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Dispatcher {

	public static void dispatch(ServletRequest req,ServletResponse res,String viewName){
		System.out.println("----------Dispatcher--------------");
		String target=null;
		RequestDispatcher rd=null;
		if(viewName.equals("show"))
		{
			target="show_profile.jsp";
			
		}
		else if(viewName.equals("error"))
		{
			target="error.jsp";
		}
		else{
			throw new IllegalArgumentException("Invalid view name");
		}
		try{
			//forward request to jsp
			rd=req.getRequestDispatcher(target);
			rd.forward(req, res);
		}	
		catch(ServletException se)
		{
			se.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
