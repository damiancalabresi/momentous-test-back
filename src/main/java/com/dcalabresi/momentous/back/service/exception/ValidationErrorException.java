package com.dcalabresi.momentous.back.service.exception;

/**
 * Created by damian on 11/29/15.
 */
public class ValidationErrorException extends RuntimeException {

    public ValidationErrorException(String message) {
        super(message);
    }

}
