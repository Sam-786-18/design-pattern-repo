package com.mhb.pattern.external2;

import com.mhb.pattern.dto.StockIdDetailsDTO;

public class FindStockValueServiceImpl implements FindStockValueService {

	@Override
	public int getCurrentStockValue(StockIdDetailsDTO idDto) {
		// TODO Auto-generated method stub
		if(idDto.getStockId()==1001)
			return 2000;
		else if(idDto.getStockId()==1002)
			return 1000;
		else 
			throw new IllegalArgumentException("Invalid StockId");
		
	}

}
