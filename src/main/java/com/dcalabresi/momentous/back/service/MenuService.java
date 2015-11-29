package com.dcalabresi.momentous.back.service;

import com.dcalabresi.momentous.back.entity.Currency;
import com.dcalabresi.momentous.back.entity.Menu;
import com.dcalabresi.momentous.back.repository.MenuRepository;
import com.dcalabresi.momentous.back.service.exception.MenuDoesNotExistException;
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
    public List<Menu> getByPrice(Float priceFrom, Float priceTo, Long currencyId) {
        return menuRepository.findByPriceAndCurrency(priceFrom, priceTo, currencyId);
    }

    @Transactional
    public List<Menu> getByRanking(Float rankingFrom, Float rankingTo) {
        return menuRepository.findByRanking(rankingFrom, rankingTo);
    }

    @Transactional
    public Menu getOne(Long id) {
        Menu menu = menuRepository.findOne(id);
        if(menu==null) throw new MenuDoesNotExistException();
        return menu;
    }

    @Transactional
    public Menu edit(Long id, String name, String description, Float price, Long currencyId, Date fromValidDate,
                     Date toValidDate, Integer fromHour, Integer fromMinute, Integer toHour, Integer toMinute,
                     Float ranking, List<String> days) {
        Menu menu = getOne(id);
        return editAndSave(name, description, price, currencyId, fromValidDate, toValidDate, fromHour,
                fromMinute, toHour, toMinute, ranking, days, menu);
    }

    @Transactional
    public Menu create(String name, String description, Float price, Long currencyId, Date fromValidDate,
                       Date toValidDate, Integer fromHour, Integer fromMinute, Integer toHour, Integer toMinute,
                       Float ranking, List<String> days) {
        Menu menu = new Menu();
        return editAndSave(name, description, price, currencyId, fromValidDate, toValidDate, fromHour,
                fromMinute, toHour, toMinute, ranking, days, menu);
    }

    private Menu editAndSave(String name, String description, Float price, Long currencyId, Date fromValidDate,
                             Date toValidDate, Integer fromHour, Integer fromMinute, Integer toHour, Integer toMinute,
                             Float ranking, List<String> days, Menu menu) {
        menu.setName(name);
        menu.setDescription(description);
        menu.setPrice(price);
        Currency currency = currencyService.getOne(currencyId);
        menu.setCurrency(currency);
        menu.setFromValidDate(fromValidDate);
        menu.setToValidDate(toValidDate);
        menu.setFromHour(fromHour);
        menu.setFromMinute(fromMinute);
        menu.setToHour(toHour);
        menu.setToMinute(toMinute);
        menu.setRanking(ranking);
        menu.setDays(days);
        return menuRepository.save(menu);
    }

    @Transactional
    public void delete(Long id) {
        menuRepository.delete(id);
    }

}
