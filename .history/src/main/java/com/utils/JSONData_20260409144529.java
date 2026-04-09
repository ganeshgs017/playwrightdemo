package com.utils;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.JsonObject;

public class JSONData {

   private static JsonObject data;

   static{

    try {
        
        String content = new String(Files.readAllBytes(Paths.get("src/main/resources/testdata.json")));
        data = new JsonObject(content);
    } catch (Exception e) {
        
        e.printStackTrace();
    }
   }

   public static String get(String keys){

    JsonObject current  = data;
    String[] keyArray = keys.split("\\.");
    for(int i =  0; i<keyArray.length-1; i++){

        current = current.getAsJsonObject(keyArray[i]);

    }
    return current.getAsString(keyArray[keyArray.length-1]);
   }

}
