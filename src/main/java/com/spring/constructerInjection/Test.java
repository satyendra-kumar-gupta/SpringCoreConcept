package com.spring.constructerInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/spring/constructerInjection/constructerinjection.xml");
        Person person=(Person) context.getBean("person");
        System.out.println(person);
    }
}
