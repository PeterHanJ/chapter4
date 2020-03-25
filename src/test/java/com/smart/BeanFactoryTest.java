package com.smart;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class BeanFactoryTest {
    public static void main(String[] args) {

        try{
            //get resource
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            Resource resource = resolver.getResource("classpath:smart-context.xml");

            System.out.println("Resource->" + resource.getURL());

            //DefaultListableBeanFactory
            DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
            XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
            reader.loadBeanDefinitions(resource);

            System.out.println("Init BeanFactory!");
            Car car = beanFactory.getBean("MyCar",Car.class);
            System.out.println("Bean Car is ready to use!");

            car.introduce();


        } catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
