package com.devsuperior.dsmeta.service;

import com.devsuperior.dsmeta.repository.SaleRepository;
import com.devsuperior.dsmeta.repository.model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(){
        return repository.findAll();
    }
}
