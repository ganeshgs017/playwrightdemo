package com.utils;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.JsonObject;

public class JSONData {

   private static JsonObject data;

   static{

     try {
        string content = new String(Files.readAllBytes(Paths.get("src/main/resources/testdata.json")));
        data = new JsonObject(content);
     } catch (Exception e) {
        e.printStackTrace();
     }
   }

   public static String get(String keys){

    JsonObject current = data;
    for(int i =0; i<keys.length()-1; i++){
        current = current.get
    }
   }

}
