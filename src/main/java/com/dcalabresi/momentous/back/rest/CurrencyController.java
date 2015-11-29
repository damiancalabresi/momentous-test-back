package com.dcalabresi.momentous.back.rest;

import com.dcalabresi.momentous.back.entity.Currency;
import com.dcalabresi.momentous.back.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by damian on 11/29/15.
 */

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    CurrencyService currencyService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Currency> getAll() {
        return currencyService.getAll();
    }

}
