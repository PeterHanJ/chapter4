package com.smart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Book {
    private String name;
    private String author;
    private int price;

    @Bean (name="MyBook")
    public Book writeMyBook(){
        Book book = new Book();
        book.setAuthor("Peter");
        book.setAuthor("How To Be Rich");
        book.setPrice(10);
        return book;
    }

    public void introduce(){
        System.out.println("Book:" + name + " ,author:" + author + " ,price:"+price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
