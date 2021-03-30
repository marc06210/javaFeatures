package com.mgu.java16;

public class PatternMatchingInstanceOfSample {
    static void java15Version(Object input) {
        if(input instanceof String) {
            String s = (String)input;
            if(s.length()>10) {
                System.out.println("s is a big String: " + s);
            } else {
                System.out.println("s is not a big String" + s);
            }
        } else {
            System.out.println("input is not a String");
        }
    }

    static void java16Version(Object input) {
        if(input instanceof String s && s.length()>10) {
            System.out.println("s is a big String: " + s);
        } else if(input instanceof String s) {
            System.out.println("s is not a big String: "+ s);
        } else {
            System.out.println("s is not a String");
        }
    }
}
