package com.mhb.pattern.service;

import com.mhb.pattern.dto.CompleteStockDetailsDTO;
import com.mhb.pattern.dto.StockInputDetailsDTO;
import com.mhb.pattern.locator.FindStockServiceLocator;
import com.mhb.pattern.sessionfacade.external4.FindStockValueFacade;

public class ShareKhanFindStockDetailsServiceImpl implements ShareKhanFindStockDetailsService {

	@Override
	public CompleteStockDetailsDTO getStockDetails(StockInputDetailsDTO dto) {
		// TODO Auto-generated method stub
		FindStockServiceLocator locator=null;
		FindStockValueFacade facade=null;
		CompleteStockDetailsDTO cDTO=null;
		//get ServiceLocator
		System.out.println("----ShareKhanFindStockDetailsServiceImpl-------");
		locator=FindStockServiceLocator.getInstance();
		System.out.println("------ShareKhanFindStockDetailsServiceImpl---"+locator.getClass());
		//get Session facade refer
		facade=locator.getservice("bse");
		System.out.println("------bse-------"+facade);
		//invoke External session facade Service
		cDTO=facade.getStockDetails(dto);
		System.out.println("----cDTO------"+cDTO.getCountry());
		return cDTO;
	}

}
