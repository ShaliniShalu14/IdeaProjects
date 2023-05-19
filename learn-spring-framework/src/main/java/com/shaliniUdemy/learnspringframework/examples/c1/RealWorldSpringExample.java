package com.shaliniUdemy.learnspringframework.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@ComponentScan
@Configuration
public class RealWorldSpringExample {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(RealWorldSpringExample.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(BusinessCalculationService.class).findMAx());
    }
}
