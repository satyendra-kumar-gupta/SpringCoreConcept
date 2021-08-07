package com.springcore.expressionlan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{10+20}")
    private int x;
    @Value("#{40+50}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double z;
    @Value("#{T(java.lang.Math).E}")
    private double a;
    @Value("#{new java.lang.String('Satyendra')}")
    private String name;
    @Value("#{10>5}")
    private boolean isActive;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", a=" + a +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
