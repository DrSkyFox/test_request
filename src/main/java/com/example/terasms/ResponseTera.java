package com.example.terasms;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
@Builder
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTera {

    private Integer status;
    private String status_description;
    private List<MessageInfo> responseTeraList;

}
