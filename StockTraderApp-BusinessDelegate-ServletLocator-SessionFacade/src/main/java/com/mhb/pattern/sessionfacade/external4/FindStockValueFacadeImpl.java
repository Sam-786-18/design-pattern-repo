package com.mhb.pattern.sessionfacade.external4;

import com.mhb.pattern.dto.CompleteStockDetailsDTO;
import com.mhb.pattern.dto.StockIdDetailsDTO;
import com.mhb.pattern.dto.StockInputDetailsDTO;
import com.mhb.pattern.external1.FindStockIdService;
import com.mhb.pattern.external1.FindStockIdServiceImpl;
import com.mhb.pattern.external2.FindStockValueService;
import com.mhb.pattern.external2.FindStockValueServiceImpl;
import com.mhb.pattern.external3.FindFutureStockValueService;
import com.mhb.pattern.external3.FindFutureStockValueServiceImpl;

public class FindStockValueFacadeImpl implements FindStockValueFacade {
	//SessionFacade desing Pattern Implementation
			
	@Override
	public CompleteStockDetailsDTO getStockDetails(StockInputDetailsDTO dto) {
		// TODO Auto-generated method stub
		FindStockIdService extService1=null;
		StockIdDetailsDTO idDTO=null;
		FindStockValueService extService2=null;
		FindFutureStockValueService extService3=null;
		int currentPrice=0,futurePrice=0;
		CompleteStockDetailsDTO completeDTO=null;
		
		
		//use 3 external comp in a order
		//use External comp1
		System.out.println("----FindStockValueFacadeImpl-----");
		System.out.println("----extService1-----"+dto.getCountry());
		extService1=new FindStockIdServiceImpl();
		idDTO=extService1.findStockId(dto);
		System.out.println("----extService1-----"+idDTO.getStockId());
		
		//use External comp2
		extService2=new FindStockValueServiceImpl();
		currentPrice=extService2.getCurrentStockValue(idDTO);
		System.out.println("----extService2-----"+currentPrice);
		
		//use External comp3
		extService3=new FindFutureStockValueServiceImpl();
		futurePrice=extService3.findFutureStockValue(idDTO);
		System.out.println("----extService3-----"+futurePrice);
		
		//prepare CompleteStockDetailsDTO
		completeDTO=new CompleteStockDetailsDTO();
		completeDTO.setStockId(idDTO.getStockId());
		completeDTO.setCountry(idDTO.getCountry());
		completeDTO.setExcangeName(idDTO.getExchange());
		completeDTO.setStockName(idDTO.getStockName());
		completeDTO.setStockPrice(currentPrice);
		completeDTO.setStockFuturePrice(futurePrice);
		System.out.println("find------"+completeDTO.getCountry());
		return completeDTO;
	}

}
