package com.aibless.category.controller.advice;

import com.aibless.category.exception.CategoryNotFoundException;
import com.aibless.category.exception.common.CategoryServicesException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CategoryControllerAdvice {
    @ExceptionHandler(value = CategoryServicesException.class)
    public ResponseEntity<String> CategoryServiceExceptionHandler(CategoryServicesException e) {
        return new ResponseEntity<>(
                e.getCategoryServicesError().getErrorMessage(),
                HttpStatus.valueOf(e.getCategoryServicesError().getErrorCode()));
    }
}
