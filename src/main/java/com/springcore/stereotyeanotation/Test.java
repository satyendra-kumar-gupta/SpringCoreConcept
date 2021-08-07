package com.springcore.stereotyeanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/stereotyeanotation/stereoconfig.xml");
        Student student=context.getBean("student",Student.class);
        System.out.println(student);
        System.out.println(student.getAddress());
    }
}
