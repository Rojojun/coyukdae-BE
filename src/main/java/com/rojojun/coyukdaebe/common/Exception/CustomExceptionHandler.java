package com.rojojun.coyukdaebe.common.Exception;

import com.rojojun.coyukdaebe.common.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(CustomException.class)
    protected ResponseEntity<ApiResponse> handleCustomExecution(CustomException e) {
        return ResponseEntity.badRequest().body(ApiResponse.createError(e.getErrorCode()));
    }
}
