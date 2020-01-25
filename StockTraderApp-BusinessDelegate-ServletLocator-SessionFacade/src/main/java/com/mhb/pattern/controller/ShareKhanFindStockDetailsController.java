package com.mhb.pattern.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mhb.pattern.delegate.ShareKhanFindStockDetailsDelegate;
import com.mhb.pattern.error.InvalidStockNameException;
import com.mhb.pattern.vo.CompleteStockDetailsVO;
import com.mhb.pattern.vo.StockInputDetailsVO;
@WebServlet("/controller")
public class ShareKhanFindStockDetailsController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method 
		String stockName=null;
		String country=null;
		StockInputDetailsVO vo=null;
		ShareKhanFindStockDetailsDelegate delegate=null;
		CompleteStockDetailsVO cVO=null;
		RequestDispatcher rd=null;
		//read form data
		stockName=req.getParameter("stock");
		country=req.getParameter("country");
		//prepare VO class Obj
		vo=new StockInputDetailsVO();
		vo.setCountry(country);
		vo.setStockName(stockName);
		//create BusinessDelegate class object
		delegate=new ShareKhanFindStockDetailsDelegate();
		try{
			System.out.println("----jjjjj-------"+vo.getCountry()+"stockname"+vo.getStockName());
			cVO=delegate.delegateToShareKhanFindStockDetailsService(vo);
			System.out.println("-----------"+cVO.getCountry());
			//keep the result in request scope
			req.setAttribute("stockDetails", cVO);
			//froward request to jsp page
			rd=req.getRequestDispatcher("show_stock_details.jsp");
		}
		catch(InvalidStockNameException ise)
		{
			System.out.println("---------fhhhh-----");
		//forward request to error page
			req.setAttribute("expMsg", ise.getMessage()+"===>"+ise.getClass());
			rd=req.getRequestDispatcher("/error.jsp");
		}
		rd.forward(req, resp);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
