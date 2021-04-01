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

        Assertions.assertThrows(NoSuchElementException.class,
                () -> {
                    Integer a = listOfTenInt.stream()
                            .filter(i -> i > 10)
                            .findFirst()
                            .orElseThrow(() -> new NoSuchElementException("element not found"));
                });

        Assertions.assertThrows(NoSuchElementException.class,
                () -> {
                    Integer a = listOfTenInt.stream()
                    .filter(i -> i>10)
                    .findFirst()
                    .orElseThrow();
                });
    }
}
