package com.springcore.expressionlan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/expressionlan/expressionconfig.xml");
        Demo demo=context.getBean("demo",Demo.class);
        System.out.println(demo);

        SpelExpressionParser spelExpressionParser=new SpelExpressionParser();
        Expression expression=spelExpressionParser.parseExpression("10+20+30+40+50");
        System.out.println(expression.getValue());
    }
}
