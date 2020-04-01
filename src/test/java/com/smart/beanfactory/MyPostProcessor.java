package com.smart.beanfactory;

import com.smart.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor
{

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("***BeanPostProcessor - postProcessBeforeInitialization" );
        if("MyCar".equals(beanName)){
            Car myCar = (Car)bean;
            if(myCar.getColor() == null){
                System.out.println("BeanPostProcessor - postProcessBeforeInitialization" );
                myCar.setColor("black");
            }
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
       if("MyCar".equals(beanName)){
           Car myCar = (Car)bean;
           if(myCar.getMaxSpeed() > 200){
               System.out.println("BeanPostProcessor - postProcessAfterInitialization");
               myCar.setMaxSpeed(200);
           }
       }
        return bean;
    }
}
