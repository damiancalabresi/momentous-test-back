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
    CurrencyService currencyService;

    @Transactional
    public List<Menu> getAll() {
        return menuRepository.findAll();
    }

    @Transactional
    public Menu getOne(Long id) {
        return menuRepository.findOne(id);
    }

    @Transactional
    public Menu edit(Long id, String name, String description, Float price, Long currencyId, Date fromValidDate,
                     Date toValidDate, Date fromHour, Date toHour, Float ranking) {
        Menu menu = getOne(id);
        return editAndSave(name, description, price, currencyId, fromValidDate, toValidDate, fromHour, toHour,
                ranking, menu);
    }

    public Menu create(String name, String description, Float price, Long currencyId, Date fromValidDate,
                       Date toValidDate, Date fromHour, Date toHour, Float ranking) {
        Menu menu = new Menu();
        return editAndSave(name, description, price, currencyId, fromValidDate, toValidDate, fromHour, toHour,
                ranking, menu);
    }

    private Menu editAndSave(String name, String description, Float price, Long currencyId, Date fromValidDate, Date toValidDate, Date fromHour, Date toHour, Float ranking, Menu menu) {
        menu.setName(name);
        menu.setDescription(description);
        menu.setPrice(price);
        Currency currency = currencyService.getOne(currencyId);
        menu.setCurrency(currency);
        menu.setFromValidDate(fromValidDate);
        menu.setToValidDate(toValidDate);
        menu.setFromHour(fromHour);
        menu.setToHour(toHour);
        menu.setRanking(ranking);
        return menuRepository.save(menu);
    }

    @Transactional
    public void delete(Long id) {
        menuRepository.delete(id);
    }

}
