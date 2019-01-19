package com.example.pby.pagingdemo;

import java.util.List;

public class Bean {

    private int code;
    private String message;
    private List<Concert> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Concert> getResult() {
        return result;
    }

    public void setResult(List<Concert> result) {
        this.result = result;
    }
}
