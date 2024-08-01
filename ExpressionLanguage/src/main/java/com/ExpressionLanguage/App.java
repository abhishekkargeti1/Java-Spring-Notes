package com.ExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ExpressionLanguage/Config.xml");
        Demo d1 = (Demo) context.getBean("demo");
        System.out.println(d1);
        
        System.out.println("-----------------------------------------------");
        
        SpelExpressionParser temp = new SpelExpressionParser();
        Expression expression = temp.parseExpression("50+89");
        
        System.out.println("Value is  " + expression.getValue());
        
        System.out.println("Value is  " + expression);
    }
}
