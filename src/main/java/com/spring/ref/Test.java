package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/spring/ref/ref.xml");
        A a=(A) context.getBean("aref");
        System.out.println(a.getX());
        System.out.println(a.getB().getY());

        System.out.println("");
        System.out.println(a);
    }
}
