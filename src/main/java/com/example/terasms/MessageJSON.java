package com.example.terasms;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MessageJSON {
    private String login;
    private String password;
    private Integer target;
    private String message;
    private String sender;

}
