package com.devsuperior.dsmeta.controller;

import com.devsuperior.dsmeta.repository.model.Sale;
import com.devsuperior.dsmeta.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping(value = "/")
    public List<Sale> findSales(){
        return service.findSales();
    }
}
