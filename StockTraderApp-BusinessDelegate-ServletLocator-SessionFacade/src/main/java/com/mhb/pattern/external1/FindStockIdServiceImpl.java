package com.mhb.pattern.external1;

import com.mhb.pattern.dto.StockIdDetailsDTO;
import com.mhb.pattern.dto.StockInputDetailsDTO;

public class FindStockIdServiceImpl implements FindStockIdService {

	@Override
	public StockIdDetailsDTO findStockId(StockInputDetailsDTO dto) {
		// TODO Auto-generated method stub
		StockIdDetailsDTO idDTO=null;
		idDTO=new StockIdDetailsDTO();
		if(dto.getStockName().equalsIgnoreCase("icici")&& dto.getCountry().equalsIgnoreCase("India"))
		{
			
			idDTO.setStockId(1001);
			idDTO.setExchange("BSE");
			idDTO.setStockName(dto.getStockName());
			idDTO.setCountry(dto.getCountry());
		}
		else if(dto.getStockName().equalsIgnoreCase("sbi")&& dto.getCountry().equalsIgnoreCase("India"))
		{
			idDTO.setStockId(1002);
			idDTO.setExchange("BSE");
			idDTO.setStockName(dto.getStockName());
			idDTO.setCountry(dto.getCountry());
		}
		else
			throw new IllegalArgumentException("Invalid Stock name");
		return idDTO;
	}

}
