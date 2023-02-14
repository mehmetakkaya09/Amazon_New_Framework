package com.amazon.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {


private static Properties properties = new Properties();

static{
 try{
 FileInputStream file= new FileInputStream("configuration.properties");


 properties.load(file);
 file.close();

 }catch(Exception e){


  e.printStackTrace();
 }

}

 public static String keyValue( String key  ){
 return properties.getProperty(key);
 }



}
