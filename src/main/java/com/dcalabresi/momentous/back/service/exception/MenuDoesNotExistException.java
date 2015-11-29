package com.dcalabresi.momentous.back.service.exception;

/**
 * Created by damian on 11/29/15.
 */
public class MenuDoesNotExistException extends ValidationErrorException {

    public MenuDoesNotExistException() {
        super("The menu does not exist");
    }

}
