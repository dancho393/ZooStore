package com.example.zoostore.api.configs;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExpcetionHandler {
    @ExceptionHandler(ResourceNotFoundExpcetion.class)
    public ResponseEntity handleResourceNotFoundException(ResourceNotFoundExpcetion exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

}
