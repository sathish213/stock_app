package com.stock.stockApp.service;

import com.stock.stockApp.model.StockInformation;
import com.stock.stockApp.model.StockInformationCustom;

import java.util.List;

public interface StockInformationService {
    List<StockInformationCustom> stockInformations();
}
