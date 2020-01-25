package com.mhb.pattern.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.mhb.pattern.businessdeligate.EmpRegistrationBusinessDeligate;
import com.mhb.pattern.commons.Log4jConfigurations;
import com.mhb.pattern.exception.EmpAlreadyExistException;
import com.mhb.pattern.exception.InvalidInputsException;
import com.mhb.pattern.exception.ProjectInternalProblem;
import com.mhb.pattern.vo.EmployeeVO;

@WebServlet("/controller")
public class EmployeeController extends HttpServlet {
/**
	 * UID
*/
private static final long serialVersionUID = 1L;
private static Logger LOG=Logger.getLogger(EmployeeController.class);
static{
	Log4jConfigurations.Configuration();
     }
@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	LOG.debug("doGet(-,-) of controller");
	System.out.println("dopost");
	String salary=null;
	String addrs=null;
	String name=null;
	EmployeeVO vo=null;
	EmpRegistrationBusinessDeligate delegate=null;
	String resultMsg=null;
	RequestDispatcher rd=null;
	//read form data
	name=req.getParameter("name");
	addrs=req.getParameter("addrs");
	salary=req.getParameter("salary");
	LOG.debug("Form data is read");
	//prepare VO class pbj
	vo=new EmployeeVO();
	vo.setEname(name);
	vo.setAddrs(addrs);
	vo.setSalary(salary);
	System.out.println("Hello --------"+vo.toString());
	LOG.debug("VO obj is created");
	//created BusinessDeligate Object
	//delegate=new EmpRegistrationBusinessDeligate();
	try{
		System.out.println("===========");
		delegate=new EmpRegistrationBusinessDeligate();
		resultMsg=delegate.delegateRegister(vo);
	
		System.out.println("-------"+resultMsg);
		LOG.debug("Business Delegate is used");
		rd=req.getRequestDispatcher("/result.jsp");
		System.out.println("-------"+rd.toString()+"-------");
		req.setAttribute("resMsg",   resultMsg);
		System.out.println("hi    " +resultMsg);
		LOG.debug("success result is kept is request scope");
	}
	catch(EmpAlreadyExistException error)
	{
		rd=req.getRequestDispatcher("/err.jsp");
		req.setAttribute("errMsg", error.getMessage());
		LOG.error("Employee number already exists");
		
	}
	catch(ProjectInternalProblem pipe)
	{
		System.out.println("Some Internal Problem");
		rd=req.getRequestDispatcher("/err.jsp");
		req.setAttribute("errMsg",pipe.getMessage());
		LOG.error("Some Internal Problem");
	}
	catch(InvalidInputsException iie)
	{
		System.out.println("Invalid Inputs Problem");
		rd=req.getRequestDispatcher("/err.jsp");
		req.setAttribute("errMsg", iie.getMessage());
		LOG.error("Invalid Inputs Problem");
	}
	catch(Exception e){
		rd=req.getRequestDispatcher("/err.jsp");
		req.setAttribute("errMsg", e.getMessage());
		System.out.println("unknow"+e.getMessage());
	}
	
		rd.forward(req, resp);
	}
@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LOG.debug("Post(-,-) method is called");
		System.out.println("doget");
		doGet(req, resp);
		
	}
}
