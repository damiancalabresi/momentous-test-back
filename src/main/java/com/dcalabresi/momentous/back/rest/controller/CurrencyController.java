package com.dcalabresi.momentous.back.rest.controller;

import com.dcalabresi.momentous.back.entity.Currency;
import com.dcalabresi.momentous.back.rest.dto.CurrencyDto;
import com.dcalabresi.momentous.back.service.currency.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Currency getCurrency(@PathVariable Long id) {
        return currencyService.getOne(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Currency createCurrency(@RequestBody @Valid CurrencyDto currencyDto) {
        return currencyService.create(currencyDto.getName());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Currency editCurrency(@PathVariable Long id, @RequestBody @Valid CurrencyDto currencyDto) {
        return currencyService.edit(id, currencyDto.getName());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCurrency(@PathVariable Long id) {
        currencyService.delete(id);
    }

}
