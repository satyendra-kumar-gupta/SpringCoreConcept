package org.saty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World Satyendra" );
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/config.xml");
        Student student=(Student)context.getBean("student");
        System.out.println(student);
        System.out.println("");
        Student student1=(Student)context.getBean("student1");
        System.out.println(student1);
    }
}
