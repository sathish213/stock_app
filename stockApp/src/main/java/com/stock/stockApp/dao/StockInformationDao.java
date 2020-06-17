package com.stock.stockApp.dao;

import com.stock.stockApp.model.StockInformation;
import com.stock.stockApp.model.StockInformationCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockInformationDao extends JpaRepository<StockInformation, Integer> {
    @Query(value = "SELECT  name, sum(prise) as price, sum(quantity) as quantity, type FROM public.information Group by name, type", nativeQuery = true)
    List<StockInformationCustom> getInfo();
}
