package com.dcalabresi.momentous.back.service;

import com.dcalabresi.momentous.back.entity.Currency;
import com.dcalabresi.momentous.back.entity.Menu;
import com.dcalabresi.momentous.back.repository.CurrencyRepository;
import com.dcalabresi.momentous.back.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by damian on 11/29/15.
 */
@Service
public class CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    public List<Currency> getAll() {
        return currencyRepository.findAll();
    }

}
