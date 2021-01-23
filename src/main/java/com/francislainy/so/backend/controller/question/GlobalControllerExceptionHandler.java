package com.francislainy.so.backend.controller.question;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class GlobalControllerExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)  // 409
    @ExceptionHandler(org.springframework.web.bind.MissingRequestHeaderException.class)
    public void handleConflict() {
        // Nothing to do
    }
}
