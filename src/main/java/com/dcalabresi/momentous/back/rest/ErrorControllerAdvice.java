package com.dcalabresi.momentous.back.rest;

import com.dcalabresi.momentous.back.service.exception.ValidationErrorException;
import com.google.common.collect.Maps;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by damian on 11/29/15.
 */
@ControllerAdvice
public class ErrorControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handleArgumentValidationException(MethodArgumentNotValidException ex) {
        String message = ex.getBindingResult().getAllErrors().stream()
                .map(objectError -> objectError.getDefaultMessage())
                .collect(Collectors.joining(". "));

        return returnError(message);
    }

    @ExceptionHandler(ValidationErrorException.class)
    public ResponseEntity<Map<String, Object>> handleValidationErrorException(ValidationErrorException ex) {
        return returnError(ex.getMessage());
    }

    private ResponseEntity<Map<String, Object>> returnError(String message) {
        Map<String, Object> body = Maps.newHashMap();
        body.put("message", message);
        return new ResponseEntity<Map<String, Object>>(body, HttpStatus.BAD_REQUEST);
    }
}
