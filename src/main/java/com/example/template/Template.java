package com.example.template;

public class Template { // Main Class
    private static Template INSTANCE;

    public static Template getInstance() {
        return INSTANCE;
    }

    public Template() {
        INSTANCE = this;
    }
}
