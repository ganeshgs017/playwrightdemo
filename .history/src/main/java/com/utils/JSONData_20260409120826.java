package com.utils;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONData {

    private static JSONData data;

    static{

        try {
            String content = new String(Files.readAllBytes(Paths.get("src/main/resources/testdata.json")));
        } catch (Exception e) {
            
        }
    }

}
