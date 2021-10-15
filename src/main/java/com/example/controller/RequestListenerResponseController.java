package com.example.controller;

import com.example.model.Response;
import com.example.service.ResponseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/pull")
public class RequestListenerResponseController {

    private static final String template = "Pull got message body: ";
    private final ResponseService service;

    @Autowired
    public RequestListenerResponseController(ResponseService service) {
        this.service = service;
    }

    @PostMapping("/post")
    public Response listenerPost(
            @RequestParam(value = "body", required = false, defaultValue = "Listen here!") String body,
            @RequestParam(value = "error", required = false, defaultValue = "false") Boolean error,
            HttpServletRequest request
            ) {
        log.info("Post Request... Body: {}; error: {}", body, error);
        log.info("request: {]", request.getContextPath());
        if(!error) {
            return service.getResponseMsg(template + body,true);
        } else
            return service.getResponseMsg(template + body,false);
    }

    @GetMapping("/get")
    public Response listenerGet(
            @RequestParam(value = "body", required = false, defaultValue = "Listen here!") String body,
            @RequestParam(value = "error", required = false, defaultValue = "false") Boolean error
    ) {
        log.info("Get Request... Body: {}; error: {}", body, error);
        if(!error) {
            return service.getResponseMsg(template + body,true);
        } else
            return service.getResponseMsg(template + body,false);
    }




}
