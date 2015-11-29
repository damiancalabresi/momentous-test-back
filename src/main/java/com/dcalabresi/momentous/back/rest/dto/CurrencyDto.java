package com.dcalabresi.momentous.back.rest.dto;

public class CurrencyDto {

    private String name;

    public CurrencyDto() {
    }

    public CurrencyDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
