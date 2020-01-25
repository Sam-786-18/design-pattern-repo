package com.mhb.pattern.sessionfacade.external4;

import com.mhb.pattern.dto.CompleteStockDetailsDTO;
import com.mhb.pattern.dto.StockInputDetailsDTO;

public interface FindStockValueFacade {
public CompleteStockDetailsDTO getStockDetails(StockInputDetailsDTO dto);
}
