package com.mgu.java11;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class NotPredicateSample {

    public static List<String> filterWithoutNotPredicate(List<String> input) {
        return input.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toUnmodifiableList());
    }

    public static List<String> filterUsingNotPredicate(List<String> input) {
        return input.stream()
                .filter(not(String::isEmpty))
                .collect(Collectors.toUnmodifiableList());
    }
}
