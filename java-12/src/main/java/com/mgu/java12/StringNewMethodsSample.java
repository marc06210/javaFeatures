package com.mgu.java12;

public class StringNewMethodsSample {
    public static void main(String[] args){
        // indent method
        String text = "Hello AirFrance!\nThis is Java 12 article.";
        System.out.println(text.indent(4));
        System.out.println(text.indent(-10));

        // transform method
        String reverse = text.transform(value ->
                new StringBuilder(value).reverse().toString()
        );
        System.out.println(reverse);
    }
}
