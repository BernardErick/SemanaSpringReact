package com.devsuperior.dsmeta.controller;

import com.devsuperior.dsmeta.repository.model.Sale;
import com.devsuperior.dsmeta.service.SaleService;
import com.devsuperior.dsmeta.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @Autowired
    private SmsService smsService;

    @GetMapping(value = "/")
    public Page<Sale> findSales(
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
            Pageable pageable){
        return service.findSales(minDate, maxDate, pageable);
    }
    @GetMapping(value = "/{id}/notification/")
    public void notifySms(@PathVariable("id") Long id){
        smsService.sendSms(id);
    }
}
