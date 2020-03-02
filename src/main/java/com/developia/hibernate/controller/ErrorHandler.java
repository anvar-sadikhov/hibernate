package com.developia.hibernate.controller;

import com.developia.hibernate.exceptions.BadRequest;
import com.developia.hibernate.exceptions.NotFoundException;
import com.developia.hibernate.exceptions.SignException;
import com.developia.hibernate.exceptions.UnauthorizedException;
import com.developia.hibernate.model.RestErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public RestErrorResponse notFoundException(NotFoundException ex) {
        return new RestErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage());
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthorizedException.class)
    public RestErrorResponse unauthorizedException(UnauthorizedException ex) {
        return new RestErrorResponse(
                HttpStatus.UNAUTHORIZED.value(),
                ex.getMessage()
        );
    }


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoSuchElementException.class)
    public RestErrorResponse noSuchElementException(NoSuchElementException ex) {
        return new RestErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage()
        );
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(SignException.class)
    public RestErrorResponse signException(SignException ex) {
        return new RestErrorResponse(
                HttpStatus.UNAUTHORIZED.value(),
                ex.getMessage());

    }
}
