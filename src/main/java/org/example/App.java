package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Type;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // XML Based configurations
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // ANNOTATION Based configuration
        ApplicationContext factory = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        Engine engine = factory.getBean(Engine.class);
        engine.model();

    }
}
