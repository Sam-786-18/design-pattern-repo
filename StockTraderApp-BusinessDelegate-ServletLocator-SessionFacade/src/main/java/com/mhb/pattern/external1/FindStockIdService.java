package com.mhb.pattern.external1;

import com.mhb.pattern.dto.StockIdDetailsDTO;
import com.mhb.pattern.dto.StockInputDetailsDTO;

public interface FindStockIdService {
public StockIdDetailsDTO findStockId(StockInputDetailsDTO dto);
}
