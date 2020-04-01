package com.smart.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if("MyCar".equals(beanName)){
            System.out.println("InstantiationAwareBeanPostProcessorAdapter - postProcessBeforeInitialization");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if("MyCar".equals(beanName)){
            System.out.println("InstantiationAwareBeanPostProcessorAdapter - postProcessAfterInstantiation");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if("MyCar".equals(beanName)){
            System.out.println("InstantiationAwareBeanPostProcessorAdapter - postProcessPropertyValues");
            for(PropertyValue p : pvs.getPropertyValues()){
                System.out.println(p.getName() + "-" + p.getValue());
            }
        }

        return pvs;
    }
}
