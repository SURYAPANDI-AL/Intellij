package com.collection;

import java.io.*;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) throws IOException {

        Properties properties= new Properties();

        File file = new File("myfile.txt");
        file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        fileInputStream.close();

        properties.setProperty("name","suryapandi");
        properties.setProperty("laptopModel","dell");
        String modelName = properties.getProperty("laptopModel");
        System.out.println(modelName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream,"modified by author");
        fileOutputStream.close();

    }
}
