package com.springcore.standalone.colllections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/standalone/colllections/aloneconfig.xml");
        Person person=context.getBean("person",Person.class);
        System.out.println(person);

    }
}
