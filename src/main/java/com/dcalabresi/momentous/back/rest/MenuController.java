package com.dcalabresi.momentous.back.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by damian on 11/29/15.
 */

@RestController
@RequestMapping("/menu")
public class MenuController {

    @RequestMapping("/")
    public String getAll() {
        return "Hello world!";
    }

}
