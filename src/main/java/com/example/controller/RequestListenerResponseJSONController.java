package com.example.controller;

import com.example.model.RequestData;
import com.example.model.Response;
import com.example.service.ResponseService;
import com.example.service.ResponseTeraProvider;
import com.example.terasms.MessageJSON;
import com.example.terasms.ResponseTera;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Slf4j
@RestController
@RequestMapping("/pull_json")
public class RequestListenerResponseJSONController {

    private static final String template = "Pull JSON got message body: ";

    private final ResponseService service;
    private final ResponseTeraProvider teraProvider;

    @Autowired
    public RequestListenerResponseJSONController(ResponseService service, ResponseTeraProvider teraProvider) {
        this.service = service;
        this.teraProvider = teraProvider;
    }

    @PostMapping(value = "/post", consumes = "application/json", produces = "application/json")
    public Response listenerPost(@RequestBody RequestData body) {
        log.info("Post Request... Body: {}", body);
        if(!body.getIsError()) {
            service.getResponseMsg(template + body, false);
        }
        return service.getResponseMsg(template + body, true);
    }


    @PostMapping(value = "/post_tera", consumes = "application/json", produces = "application/json")
    public ResponseTera listenerPost(@RequestBody MessageJSON body) {
        log.info("Post Request... Body: {}", body);
        return teraProvider.getResponseMsg(body, 1, false);
    }




    @GetMapping("/get")
    public Response listenerGet(@RequestBody RequestData body) {
        log.info("Get Request... Body: {}", body);
        if(!body.getIsError()) {
            service.getResponseMsg(template + body, false);
        }
        return service.getResponseMsg(template + body, true);
    }




}
