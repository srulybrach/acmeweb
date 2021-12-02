package com.acme.statusmgr;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;


@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class Exception extends java.lang.Exception {
    public Exception(String message){
        super(message);
    }
}
