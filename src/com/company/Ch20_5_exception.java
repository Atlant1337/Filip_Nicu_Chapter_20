package com.company;
public class Ch20_5_exception extends RuntimeException{
    public Ch20_5_exception() {
        this("Subscript Exception");
    }

    public Ch20_5_exception(String message) {
        super(message);
    }
}