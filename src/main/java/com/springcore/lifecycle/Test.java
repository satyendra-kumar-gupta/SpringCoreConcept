package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/lifecycle/lifecycle.xml");
        Samosa samosa=(Samosa) context.getBean("samosa");
        System.out.println(samosa);
        context.registerShutdownHook();

        Pepsi pepsi=(Pepsi) context.getBean("pepsi");
        System.out.println(pepsi);

        Example example=(Example) context.getBean("example");
        System.out.println(example);
    }
}
