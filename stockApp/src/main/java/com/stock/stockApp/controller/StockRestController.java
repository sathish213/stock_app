package com.stock.stockApp.controller;

import com.stock.stockApp.model.StockInformation;
import com.stock.stockApp.model.StockInformationCustom;
import com.stock.stockApp.service.StockInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockRestController {

    @Autowired
    StockInformationService stockInformationService;

    @GetMapping("/info")
    public List<StockInformationCustom> stockInformations(){
        return stockInformationService.stockInformations();
    }
}
