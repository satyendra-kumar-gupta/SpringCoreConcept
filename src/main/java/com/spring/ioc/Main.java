package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Keys{
    public  void run(Engine key){
        key.start();
    }
}
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/spring/ioc/iocconfig.xml");
        Engine key=(Engine) context.getBean("engine");
        new Keys().run(key);

    }
}
