package com.example.terasms;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MessageInfo {

    private static Random random = new Random();

    @Builder.Default
    private Integer id = random.nextInt(0, 999999999);

    @Builder.Default
    private Integer msisdn = random.nextInt(0, 999999999);

    @Builder.Default
    private Integer status = 0;


}
