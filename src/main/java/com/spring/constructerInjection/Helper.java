package com.spring.constructerInjection;

public class Helper {
    String name;

    public Helper(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
