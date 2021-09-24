package com.example.model;

import lombok.*;

@Data
@Builder(toBuilder = true)
@Getter
@Setter(value = AccessLevel.PUBLIC)
public class RequestData {
    private Long id;
    private String data;
    private Boolean isError;
}
