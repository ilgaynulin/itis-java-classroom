package com.company.enums;

public enum Color {
    WHITE("#FFFFFF"),
    BLACK("#000000"),
    RED("#FF0000");

    String code;

    Color(String code) {
        this.code = code;
    }
}
