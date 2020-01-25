package com.mhb.pattern.delegate;

import com.mhb.pattern.dto.CompleteStockDetailsDTO;
import com.mhb.pattern.dto.StockInputDetailsDTO;
import com.mhb.pattern.error.InvalidStockNameException;
import com.mhb.pattern.service.ShareKhanFindStockDetailsService;
import com.mhb.pattern.service.ShareKhanFindStockDetailsServiceImpl;
import com.mhb.pattern.vo.CompleteStockDetailsVO;
import com.mhb.pattern.vo.StockInputDetailsVO;

public class ShareKhanFindStockDetailsDelegate {

	public CompleteStockDetailsVO delegateToShareKhanFindStockDetailsService(StockInputDetailsVO vo)throws InvalidStockNameException
	{
		StockInputDetailsDTO inputDetailsDTO=null;
		ShareKhanFindStockDetailsService skDetailsService=null;
		CompleteStockDetailsDTO cDetailsDTO=null;
		CompleteStockDetailsVO cDetailsVO=null;
		//convert vo class obj to Dto class obj
		
		inputDetailsDTO=new StockInputDetailsDTO();
		inputDetailsDTO.setStockName(vo.getStockName());
		inputDetailsDTO.setCountry(vo.getCountry());
		System.out.println("-------input ---------");
		try{
			System.out.println("----------try-----------");
			skDetailsService=new ShareKhanFindStockDetailsServiceImpl();
			cDetailsDTO=skDetailsService.getStockDetails(inputDetailsDTO);
			System.out.println("---------close try-----");
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("------catch-----------");
			throw new InvalidStockNameException(iae.getMessage());
		}
		//convert CompleteStockDetailsDTO class obj to Comple
		cDetailsVO =new CompleteStockDetailsVO();
		cDetailsVO.setStockName(cDetailsDTO.getStockName());
		cDetailsVO.setCountry(cDetailsDTO.getCountry());
		cDetailsVO.setExchangeName(cDetailsDTO.getExcangeName());
		cDetailsDTO.setStockId(cDetailsDTO.getStockId());
		cDetailsVO.setStockPrice(String.valueOf(cDetailsDTO.getStockPrice()));
		cDetailsVO.setStockFuturePrice(String.valueOf(cDetailsDTO.getStockFuturePrice()));
		return cDetailsVO;
		
	}
	
}
