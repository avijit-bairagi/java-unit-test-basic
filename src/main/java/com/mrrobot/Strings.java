package com.mrrobot;

public class Strings {
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String getMessage(String msg){
        return msg;
    }
}