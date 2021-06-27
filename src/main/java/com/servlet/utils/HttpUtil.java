package com.servlet.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;

public class HttpUtil {
    String value;
    public HttpUtil(String value){
        this.value = value;
    }

    public static HttpUtil of (BufferedReader reader){
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null){
                sb.append(line);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new HttpUtil(sb.toString());
    }

    public <T> T toModel(Class<T> tClass){
        try {
            return new ObjectMapper().readValue(value, tClass);
        }catch (Exception e){
            return null;
        }
    }
}
