package com.shaliniUdemy.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address){};
record Address(String line1, String line2){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return  "Radha Rani";
    }
    @Bean(name = "agebean")
    public int age(){
        return  24;
    }
    @Bean
    public Person shaliniPerson1(){
        return  new Person("Person1" , 30, new Address("aa","aa"));
    }

    @Bean (name = "person2")
    public Person shaluPerson2MethodCall(){
        return  new Person(name() ,age(), new Address("Vrindavan", "RR"));
    }

    @Bean (name = "person3")
    public Person shaluPerson3ParametersCall(String name, int agebean, Address myaddress){
        return  new Person(name,agebean,myaddress);
    }
    @Bean (name = "person4")
    public Person shaluPerson4Qualifier(String name, int agebean, @Qualifier("addressqualifier") Address myaddress2){
        return  new Person(name,agebean,myaddress2);
    }


    @Bean
    @Primary  // it is added to make use whenever Address.class is called
    public Address myaddress()
    {
        return new Address("Issarstrasse 10", "Germany");
    }
    @Bean
    @Qualifier("addressqualifier")
    public Address myaddress2()
    {
        return new Address("KVVVVVVVVVVV", "Kankarbagh");
    }



}
