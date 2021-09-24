package com.example.implementation;

import com.example.model.Response;
import com.example.service.ResponseService;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class ResponseServiceImpl implements ResponseService {


    private final AtomicLong counter = new AtomicLong();

    @Override
    public Response getResponseMsg(String body, String error) {
        return Response.builder().counter(counter.incrementAndGet()).status(error).body(body).build();
    }
}
