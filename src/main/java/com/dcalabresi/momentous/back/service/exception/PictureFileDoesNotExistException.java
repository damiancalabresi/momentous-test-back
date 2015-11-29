package com.dcalabresi.momentous.back.service.exception;

/**
 * Created by damian on 11/29/15.
 */
public class PictureFileDoesNotExistException extends ValidationErrorException {

    public PictureFileDoesNotExistException() {
        super("The picture file does not exist");
    }

}
