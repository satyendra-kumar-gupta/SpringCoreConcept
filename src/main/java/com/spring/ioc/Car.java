package com.spring.ioc;

public class Car implements Engine{
    @Override
    public void start() {
        System.out.println("Car has been started");
    }
}