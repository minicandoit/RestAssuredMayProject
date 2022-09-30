package com.Nestbridge.TestUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties=new Properties();

    static {
        //1==>if I don't create I can't write anything
        //2==>important thing must happen before everything else
        //#2-Get the path and open the file
        // String path="configuration.properties";
        try {
            FileInputStream file = new FileInputStream("configuration.properties");//opening the memory from JVM memory

            //#3-Load the opened file into the Properties object.
            properties.load(file);

            //closing the file in JVM Memory
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //For windows>copy path>copy path from content root

    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }

}

