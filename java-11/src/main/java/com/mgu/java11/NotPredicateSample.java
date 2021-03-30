package com.mgu.java11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class NotPredicateSample {
    static List<String> originals = Arrays.asList("a", "");

    public static void main(String[] args) {
        oldWay();
        newWay();
    }

    static void oldWay() {
        List<String> result = originals.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toUnmodifiableList());
        System.out.println(result);
    }

    static void newWay() {
        List<String> result = originals.stream()
                .filter(not(String::isEmpty))
                .collect(Collectors.toUnmodifiableList());
        System.out.println(result);
    }
}
