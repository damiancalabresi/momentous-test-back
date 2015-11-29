package com.dcalabresi.momentous.back.repository;

import com.dcalabresi.momentous.back.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by damian on 11/29/15.
 */
public interface CurrencyRepository extends JpaRepository<Currency, Long> {



}
