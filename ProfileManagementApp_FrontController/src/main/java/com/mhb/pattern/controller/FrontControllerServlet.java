package com.mhb.pattern.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mhb.pattern.command.Command;
import com.mhb.pattern.command.CommandHelper;
import com.mhb.pattern.dispacher.Dispatcher;
import com.mhb.pattern.model.ProfileModel;

@WebServlet("*.do")
public class FrontControllerServlet extends HttpServlet {

	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("-----------------------doGet-------------");
		String path=null;
		ProfileModel model=null;
		Command cmmand=null;
		String viewName=null;
		//get incoming request url's servlet path
		path=req.getServletPath();
		model=new ProfileModel();
		model.setPid(Integer.parseInt(req.getParameter("pid")));
		model.setCountry(req.getParameter("country"));
		//get Command object
		cmmand=CommandHelper.getCommand(path);
		//get Logical view name
		viewName=cmmand.execute(req, resp, model);
		//use Dispatcher to forward request to result page
		Dispatcher.dispatch(req, resp, viewName);
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("---------FrontControllerServlet-----------");
		doGet(req, resp);
	}
}
