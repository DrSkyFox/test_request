package com.example.service;

import com.example.terasms.MessageJSON;
import com.example.terasms.ResponseTera;

public interface ResponseTeraProvider  {
    ResponseTera getResponseMsg(MessageJSON messageJSON, Integer count, Boolean errors);
}
