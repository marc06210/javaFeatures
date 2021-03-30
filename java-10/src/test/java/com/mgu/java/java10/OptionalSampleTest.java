package com.mgu.java.java10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalSampleTest {
    @Test
    public void orElseThrow() {
        var listOfTenInt = Stream.of(10).collect(Collectors.toUnmodifiableList());

        var five = listOfTenInt.stream()
                .filter(i -> i>5)
                .findFirst()
                .orElseThrow();

        Assertions.assertThrows(NoSuchElementException.class,
                () -> listOfTenInt.stream()
                    .filter(i -> i>10)
                    .findFirst()
                    .orElseThrow());
    }
}
