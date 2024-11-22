package com.scalekit.exceptions;

import lombok.Getter;

@Getter
public class WebHookException extends RuntimeException{

    final String message;

    public WebHookException(String message) {
        super(message);
        this.message = message;
    }

}
