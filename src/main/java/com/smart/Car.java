package com.smart;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Bean Life Cycle Interface
 * BeanNameAware       -      setBeanName()
 * BeanFactoryAware    -      setBeanFactory()
 * InitializingBean    -      afterPropertiesSet()
 * DisposableBean      -      destroy()
 * ApplicationContextAware -  for applicationContext
 */

public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean , ApplicationContextAware {
    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    //constructor
    public Car(){
        System.out.println("Car -> Constructor");
    }

    //BeanFactoryAware
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware - setBeanFactory:" + beanFactory);
        this.beanFactory = beanFactory;
    }
    //BeanNameAware
    public void setBeanName(String beanName) {
        System.out.println("BeanNameAware - setBeanName:"+ beanName);
        this.beanName = beanName;
    }
    //DisposableBean
    public void destroy() throws Exception {
        System.out.println("DisposableBean - destroy");
    }
    //InitializingBean
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean - afterPropertiesSet -------");
        System.out.println("Color-->" + this.getColor());
        System.out.println("InitializingBean - afterPropertiesSet -------");
    }

    //bean property init-method define
    public void myInit(){
        System.out.println("call <init-method> defined myInit() - max speed change to 240");
        setMaxSpeed(240);
    }

    //bean property destroy-method define
    public void myDestroy(){
        System.out.println("call <destroy-method defined myDestroy()");
    }

    public void introduce(){
        System.out.println("Car Brand:" + brand + " ,color:"+color+" ,max speed:"+maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("setBrand");
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println("setColor");
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        System.out.println("setSpeed");
        this.maxSpeed = maxSpeed;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String getBeanName() {
        return beanName;
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware - setApplicationContext");
    }
}
