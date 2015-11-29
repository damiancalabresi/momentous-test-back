package com.dcalabresi.momentous.back.rest.dto;

import java.util.Date;

public class MenuDto {

    private String name;

    private String description;

    private Float price;

    private Long currencyId;

    private Date fromValidDate;

    private Date toValidDate;

    private Date fromHour;

    private Date toHour;

    private Float ranking;

    public MenuDto() {
    }

    public MenuDto(String name, String description, Float price, Long currencyId, Date fromValidDate,
                   Date toValidDate, Date fromHour, Date toHour, Float ranking) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.currencyId = currencyId;
        this.fromValidDate = fromValidDate;
        this.toValidDate = toValidDate;
        this.fromHour = fromHour;
        this.toHour = toHour;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public Date getFromValidDate() {
        return fromValidDate;
    }

    public void setFromValidDate(Date fromValidDate) {
        this.fromValidDate = fromValidDate;
    }

    public Date getToValidDate() {
        return toValidDate;
    }

    public void setToValidDate(Date toValidDate) {
        this.toValidDate = toValidDate;
    }

    public Date getFromHour() {
        return fromHour;
    }

    public void setFromHour(Date fromHour) {
        this.fromHour = fromHour;
    }

    public Date getToHour() {
        return toHour;
    }

    public void setToHour(Date toHour) {
        this.toHour = toHour;
    }

    public Float getRanking() {
        return ranking;
    }

    public void setRanking(Float ranking) {
        this.ranking = ranking;
    }

}
