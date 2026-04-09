package com.utils;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.JsonObject;

public class JSONData {

    private static JsonObject

    static{

        try {
            String content = new String(Files.readAllBytes(Paths.get("src/main/resources/testdata.json")));
            data = new JsonObject(content);
        } catch (Exception e) {
            
        }
    }

}
