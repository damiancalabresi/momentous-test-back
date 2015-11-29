package com.dcalabresi.momentous.back.rest;

import com.dcalabresi.momentous.back.entity.Menu;
import com.dcalabresi.momentous.back.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

}
