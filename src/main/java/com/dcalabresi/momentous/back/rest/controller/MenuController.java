package com.dcalabresi.momentous.back.rest.controller;

import com.dcalabresi.momentous.back.entity.Menu;
import com.dcalabresi.momentous.back.rest.dto.MenuDto;
import com.dcalabresi.momentous.back.rest.dto.PriceDto;
import com.dcalabresi.momentous.back.rest.dto.RankingDto;
import com.dcalabresi.momentous.back.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by damian on 11/29/15.
 */

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Menu> getAll() {
        return menuService.getAll();
    }

    @RequestMapping(value = "/filter/price", method = RequestMethod.POST)
    public List<Menu> getByPrice(@RequestBody @Valid PriceDto priceDto) {
        return menuService.getByPrice(priceDto.getPriceFrom(), priceDto.getPriceTo(), priceDto.getCurrencyId());
    }

    @RequestMapping(value = "/filter/ranking", method = RequestMethod.POST)
    public List<Menu> getByRanking(@RequestBody @Valid RankingDto rankingDto) {
        return menuService.getByRanking(rankingDto.getRankingFrom(), rankingDto.getRankingTo());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Menu getMenu(@PathVariable Long id) {
        return menuService.getOne(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Menu createMenu(@RequestBody @Valid MenuDto menuDto) {
        return menuService.create(menuDto.getName(), menuDto.getDescription(), menuDto.getPrice(),
                menuDto.getCurrencyId(), menuDto.getFromValidDate(), menuDto.getToValidDate(), menuDto.getFromHour(),
                menuDto.getFromMinute(), menuDto.getToHour(), menuDto.getToMinute(), menuDto.getRanking(),
                menuDto.getDays(), menuDto.getPictureFile());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Menu editMenu(@PathVariable Long id, @RequestBody @Valid MenuDto menuDto) {
        return menuService.edit(id, menuDto.getName(), menuDto.getDescription(), menuDto.getPrice(),
                menuDto.getCurrencyId(), menuDto.getFromValidDate(), menuDto.getToValidDate(), menuDto.getFromHour(),
                menuDto.getFromMinute(), menuDto.getToHour(), menuDto.getToMinute(), menuDto.getRanking(),
                menuDto.getDays(), menuDto.getPictureFile());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMenu(@PathVariable Long id) {
        menuService.delete(id);
    }

    @RequestMapping(value = "/pictures", method = RequestMethod.GET)
    public List<String> getAvailablePictures() {
        return menuService.getAvailablePictures();
    }

}
