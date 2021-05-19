package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AnnotationConfig
{
//    @Bean
//    public Engine getEngine()
//    {
//        return new Engine();
//    }
//
//    @Bean
//    public Manufacturer getManufacturer()
//    {
//        return new Toyota();
//    }
}
