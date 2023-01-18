package com.example.dockerspringdemo.constant.exception;

import com.example.dockerspringdemo.dto.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(CustomException.class)
    protected ResponseEntity<BaseResponse> handleCustomException(CustomException e){
        return ResponseEntity.status(e.errorCode.getHttpStatus())
                .body(BaseResponse.fail(e.errorCode.getHttpStatus(), e.errorCode.getMessage()));
    }
}
