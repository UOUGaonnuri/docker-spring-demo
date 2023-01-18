package com.example.dockerspringdemo.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@Builder
@RequiredArgsConstructor(staticName = "of")
public class BaseResponse<T> {
    private final HttpStatus status;
    private final T data;
    private final String message;

    public static BaseResponse<Object> success(Object resultData) {
        return BaseResponse.builder()
                .status(HttpStatus.OK)
                .data(resultData)
                .message("Success")
                .build();
    }

    public static BaseResponse<Object> fail(HttpStatus status, String errorMsg){
        return BaseResponse.builder()
                .status(status)
                .data(errorMsg)
                .message("Error")
                .build();
    }
}
