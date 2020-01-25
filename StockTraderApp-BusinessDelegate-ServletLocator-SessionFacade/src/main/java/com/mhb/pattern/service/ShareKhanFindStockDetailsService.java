package com.mhb.pattern.service;

import com.mhb.pattern.dto.CompleteStockDetailsDTO;
import com.mhb.pattern.dto.StockInputDetailsDTO;

public interface ShareKhanFindStockDetailsService {
public CompleteStockDetailsDTO getStockDetails(StockInputDetailsDTO dto);
}
