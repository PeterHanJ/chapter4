package com.smart;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileSourceTest {
    public static void main(String[] args) {
        try {
            String filePath = "/Users/peter/Dev/IdeaWorkSpace/chapter4/src/main/resources/config/file1.txt";

            //load resource by system path
            WritableResource res1 = new PathResource(filePath);

            //load resource by class path
            Resource res2 = new ClassPathResource("/config/file1.txt");

            //Write to file
            OutputStream out1 = res1.getOutputStream();
            out1.write("我是韩俊".getBytes());
            out1.close();

            //Read from file
            InputStream in = res2.getInputStream();
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            int i;
            while( (i=in.read()) != -1){
                bao.write(i);
            }
            System.out.println(res2.getFilename() + " ," + bao.toString());

            in.close();
            bao.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
