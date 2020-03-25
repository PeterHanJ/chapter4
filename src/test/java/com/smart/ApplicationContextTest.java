package com.smart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        Car car = context.getBean("MyCar",Car.class);
        car.introduce();
    }
}

