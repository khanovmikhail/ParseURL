package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseURL {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //Read an url from InputStream

        //Cut url string to arguments and saves it's to String[] array
        url = url.replaceFirst("\\S*\\?", "");
        String[] arguments = url.split("&");

        //Print argument names and saves value if arg name is "obj"
        String obj = null;
        for (String str: arguments) {
            String s = str.replaceFirst("\\=\\S*", "");
            System.out.println(s);
            if (s.equalsIgnoreCase("obj")){
                obj = str.replaceFirst("\\S*\\=", "");
            }
        }
        //If obj argument exist print it
        if (obj != null) {
            try {
                double d = Double.parseDouble(obj);
                alert(d);
            }catch (NumberFormatException e){
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
