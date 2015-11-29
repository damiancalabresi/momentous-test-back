package com.dcalabresi.momentous.back.rest.dto;

import java.util.Date;
import java.util.List;

public class MenuDto {

    private String name;

    private String description;

    private Float price;

    private Long currencyId;

    private Date fromValidDate;

    private Date toValidDate;

    private Integer fromHour;

    private Integer fromMinute;

    private Integer toHour;

    private Integer toMinute;

    private Float ranking;

    private List<String> days;

    public MenuDto() {
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

    public Integer getFromHour() {
        return fromHour;
    }

    public void setFromHour(Integer fromHour) {
        this.fromHour = fromHour;
    }

    public Integer getFromMinute() {
        return fromMinute;
    }

    public void setFromMinute(Integer fromMinute) {
        this.fromMinute = fromMinute;
    }

    public Integer getToHour() {
        return toHour;
    }

    public void setToHour(Integer toHour) {
        this.toHour = toHour;
    }

    public Integer getToMinute() {
        return toMinute;
    }

    public void setToMinute(Integer toMinute) {
        this.toMinute = toMinute;
    }

    public Float getRanking() {
        return ranking;
    }

    public void setRanking(Float ranking) {
        this.ranking = ranking;
    }

    public List<String> getDays() {
        return days;
    }

    public void setDays(List<String> days) {
        this.days = days;
    }

}
