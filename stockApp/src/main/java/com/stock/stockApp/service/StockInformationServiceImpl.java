package com.stock.stockApp.service;

import com.stock.stockApp.dao.StockInformationDao;
import com.stock.stockApp.model.StockInformation;
import com.stock.stockApp.model.StockInformationCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockInformationServiceImpl implements StockInformationService {

    @Autowired
    StockInformationDao stockInformationDao;
    @Override
    public List<StockInformationCustom> stockInformations() {
        return stockInformationDao.getInfo();
    }
}
