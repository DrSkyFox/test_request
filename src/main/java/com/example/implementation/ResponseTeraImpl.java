package com.example.implementation;

import com.example.service.ResponseTeraProvider;
import com.example.terasms.MessageInfo;
import com.example.terasms.MessageJSON;
import com.example.terasms.ResponseTera;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResponseTeraImpl implements ResponseTeraProvider {



    @Override
    public ResponseTera getResponseMsg(MessageJSON messageJSON, Integer count, Boolean errors) {
        List<MessageInfo> messageInfoList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            messageInfoList.add(new MessageInfo());
        }
        return ResponseTera.builder()
                .status(0)
                .status_description("OK")
                .responseTeraList(messageInfoList)
                .build();
    }
}
