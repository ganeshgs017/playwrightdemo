package com.utils;

import java.nio.file.Files;
import java.nio.file.Paths;

import javax.management.RuntimeErrorException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JSONData {

   private static JsonObject data;

   static{

    try {
        
        String content = new String(Files.readAllBytes(Paths.get("src/main/resources/testdata.json")));
        data = JsonParser.parseString(content).getAsJsonObject();
    } catch (Exception e) {
        
        throw new RuntimeErrorException("Failed to load JSON File : ")
    }
   }

   public static String get(String keypath){

    JsonObject current  = data;
    String[] keyArray = keypath.split("\\.");
    for(int i =  0; i<keyArray.length-1; i++){

        current = current.getAsJsonObject(keyArray[i]);

    }
    return current.get(keyArray[keyArray.length-1]).getAsString();
   }

}
