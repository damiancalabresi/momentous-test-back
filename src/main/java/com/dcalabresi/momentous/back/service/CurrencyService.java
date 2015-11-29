package com.dcalabresi.momentous.back.service;

import com.dcalabresi.momentous.back.entity.Currency;
import com.dcalabresi.momentous.back.repository.CurrencyRepository;
import com.dcalabresi.momentous.back.service.exception.CurrencyDoesNotExistException;
import com.dcalabresi.momentous.back.service.exception.ValidationErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by damian on 11/29/15.
 */
@Service
public class CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    @Transactional
    public List<Currency> getAll() {
        return currencyRepository.findAll();
    }

    @Transactional
    public Currency getOne(Long id) {
        Currency currency = currencyRepository.findOne(id);
        if(currency==null) throw new CurrencyDoesNotExistException();
        return currency;
    }

    @Transactional
    public Currency edit(Long id, String name) {
        Currency currency = getOne(id);
        currency.setName(name);
        return currencyRepository.save(currency);
    }

    @Transactional
    public Currency create(String name) {
        Currency currency = new Currency(name);
        return currencyRepository.save(currency);
    }

    @Transactional
    public void delete(Long id) {
        currencyRepository.delete(id);
    }

}
