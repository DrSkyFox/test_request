package com.example.service;

import com.example.model.Response;

public interface ResponseService {
    Response getResponseMsg(String body, String error);

}
