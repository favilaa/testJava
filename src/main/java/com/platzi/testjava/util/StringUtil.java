package com.platzi.testjava.util;

public class StringUtil {

    public static String repeat(String str, int times){

        if (times <0){
            throw new IllegalArgumentException("NEGATIVE TIME NOT ALLOWED");
        }
        String result="";

        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
