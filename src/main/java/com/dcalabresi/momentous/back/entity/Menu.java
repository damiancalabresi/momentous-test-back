package com.dcalabresi.momentous.back.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by damian on 11/29/15.
 */
@Entity(name = "menu")
public class Menu {

    @Id
    @GeneratedValue
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="price", nullable = false)
    private Float price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="currency")
    private Currency currency;

    @Temporal(TemporalType.DATE)
    @Column(name="from_valid_date", nullable = false)
    private Date fromValidDate;

    @Temporal(TemporalType.DATE)
    @Column(name="to_valid_date", nullable = false)
    private Date toValidDate;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "menu_day", joinColumns = @JoinColumn(name = "menu_id"))
    @Column(name="day")
    private List<String> days;

    @Temporal(TemporalType.TIME)
    @Column(name="from_hour", nullable = false)
    private Date fromHour;

    @Temporal(TemporalType.TIME)
    @Column(name="to_hour", nullable = false)
    private Date toHour;

    @Column(name = "ranking", nullable = false)
    private Float ranking;

    public Menu() {
    }

    public Menu(String name, String description, Float price, Currency currency, Date fromValidDate,
                Date toValidDate, List<String> days, Date fromHour, Date toHour, Float ranking) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
        this.fromValidDate = fromValidDate;
        this.toValidDate = toValidDate;
        this.days = days;
        this.fromHour = fromHour;
        this.toHour = toHour;
        this.ranking = ranking;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
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

    public List<String> getDays() {
        return days;
    }

    public void setDays(List<String> days) {
        this.days = days;
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
