package com.company.enums;

public enum HttpResponseCode {
    NOT_FOUND(404),
    OK(200),
    BAD_REQUEST(400),
    INTERNAL_SERVER_ERROR(500);

    private int code;

    HttpResponseCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
