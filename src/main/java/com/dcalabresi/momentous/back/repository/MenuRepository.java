package com.dcalabresi.momentous.back.repository;

import com.dcalabresi.momentous.back.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by damian on 11/29/15.
 */
public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query("select m from menu m where m.price > ?1 and m.price < ?2 and m.currency.id=?3 order by m.price asc")
    List<Menu> findByPriceAndCurrency(Float priceFrom, Float priceTo, Long currencyId);

    @Query("select m from menu m where m.ranking > ?1 and m.ranking < ?2 order by m.ranking desc")
    List<Menu> findByRanking(Float rankingFrom, Float rankingTo);

}
