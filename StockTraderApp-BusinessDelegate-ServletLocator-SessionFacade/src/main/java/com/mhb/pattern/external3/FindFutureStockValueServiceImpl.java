package com.mhb.pattern.external3;

import com.mhb.pattern.dto.StockIdDetailsDTO;

public class FindFutureStockValueServiceImpl implements FindFutureStockValueService {

	@Override
	public int findFutureStockValue(StockIdDetailsDTO idDto) {
		// TODO Auto-generated method stub
		if(idDto.getStockId()==1001)
		{
			return 5000;
		}
		else if(idDto.getStockId()==1002)
		{
			return 2000;
		}
		else
		throw new IllegalArgumentException("Invalid StockId");
	}

}
