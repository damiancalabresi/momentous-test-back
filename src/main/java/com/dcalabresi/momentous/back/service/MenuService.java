package com.dcalabresi.momentous.back.service;

import com.dcalabresi.momentous.back.entity.Currency;
import com.dcalabresi.momentous.back.entity.Menu;
import com.dcalabresi.momentous.back.repository.CurrencyRepository;
import com.dcalabresi.momentous.back.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by damian on 11/29/15.
 */
@Service
public class MenuService {

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    CurrencyRepository currencyRepository;

    @Transactional
    public List<Menu> getAll() {
        return menuRepository.findAll();
    }

}
