package com.rojojun.coyukdaebe.common;

import com.rojojun.coyukdaebe.common.Exception.ErrorCode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ApiResponse<T> {
    private static ApiHealth apiHealth;
    private String status;
    private T data;
    private String message;

    public ApiResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(apiHealth.SUCCESS.status, data);
    }

    public static ApiResponse<?> noContent() {
        return new ApiResponse<>(apiHealth.SUCCESS.status, null);
    }

    public static ApiResponse<?> createFail(BindingResult bindingResult) {
        Map<String, String> errors = new HashMap<>();

        List<ObjectError> allErrors = bindingResult.getAllErrors();
        for (ObjectError error : allErrors) {
            if (error instanceof FieldError) {
                errors.put(((FieldError) error).getField(), error.getDefaultMessage());
            } else {
                errors.put(error.getObjectName(), error.getDefaultMessage());
            }
        }
        return new ApiResponse<>(apiHealth.FAIL.status, errors);
    }

    public static ApiResponse<?> createError(ErrorCode errorCode) {
        return new ApiResponse<>(apiHealth.ERROR.status, errorCode.getMessage());
    }
}
