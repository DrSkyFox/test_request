package com.example.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder(toBuilder = true)
@Getter
@Setter(value = AccessLevel.PUBLIC)
public class Response {
    private Long counter;
    private String status;
    private String body;
}
