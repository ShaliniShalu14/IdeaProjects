package com.shaliniUdemy.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        //1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2: Configure the things that we want Spring to manage-
        // HelloWorldConfiguration - @Configuration
        // name- @Bean
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("shaliniPerson1"));
        System.out.println(context.getBean("myaddress"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person4"));
        //to get list of all the beans present
       // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
