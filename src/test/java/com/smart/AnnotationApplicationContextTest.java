package com.smart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AnnotationApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Book.class);
        Book book = context.getBean("MyBook",Book.class);
        book.introduce();
    }
}
