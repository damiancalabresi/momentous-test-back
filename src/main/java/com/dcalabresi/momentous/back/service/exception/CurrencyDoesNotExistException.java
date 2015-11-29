package com.dcalabresi.momentous.back.service.exception;

/**
 * Created by damian on 11/29/15.
 */
public class CurrencyDoesNotExistException extends ValidationErrorException {

    public CurrencyDoesNotExistException() {
        super("The currency does not exist");
    }

}
