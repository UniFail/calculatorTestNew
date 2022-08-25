package com.calculatorcalculator;

public class ByZeroExaption extends IllegalArgumentException{
    public ByZeroExaption() {
    }

    public ByZeroExaption(String s) {
        super(s);
    }

    public ByZeroExaption(String message, Throwable cause) {
        super(message, cause);
    }

    public ByZeroExaption(Throwable cause) {
        super(cause);
    }
}
