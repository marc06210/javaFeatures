package com.mgu.java11;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Allow usage of annotation, which can modify the behavior.
 */
public class LocalVarLambdaSample {
    static List<String> originals = Arrays.asList("a", "", null, "b");

    public static void main(String[] args) {
        try {
            oldWay(); // NullPointerException
        } catch(Exception e) {
            System.out.println(e.getClass().getName());
        }
        try {
            newWay(); // IllegalArgumentException
        } catch(Exception e) {
            System.out.println(e.getClass().getName());
        }
    }

    static void oldWay() {
        List<String> result = originals.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(result);
    }

    static void newWay() {
        List<String> result = originals.stream()
                .map((@NotNull var s) -> s.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
