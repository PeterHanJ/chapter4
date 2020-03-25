package com.smart;


import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

public class PatternResolverTest {
    public static void main(String[] args) {
        try {
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            Resource[] resources = resolver.getResources("classpath*:smart-context.xml");

            for(Resource res : resources){
                System.out.println("res-->" + res.getFilename());
                System.out.println("url-->" + res.getURL());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
