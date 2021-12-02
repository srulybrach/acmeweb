package com.acme.statusmgr;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;


//@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class FaliureException extends ResponseStatusException {
    public FaliureException(String message){
        super(HttpStatus.BAD_REQUEST ,message);
    }
}
