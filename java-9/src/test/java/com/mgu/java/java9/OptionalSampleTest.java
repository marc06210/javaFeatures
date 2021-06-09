package com.mgu.java.java9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.Optional;

public class OptionalSampleTest {

    @Test
    public void ifPresentOrElse() {
        // the else is triggered
        Optional.ofNullable(null)
                .filter(Objects::nonNull)
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .ifPresentOrElse(
                        this::ko,
                        this::ok
                );

        // the else is triggered
        Optional.ofNullable(Integer.valueOf(12))
                .filter(Objects::nonNull)
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .ifPresentOrElse(
                        this::ko,
                        this::ok
                );

        // data is present
        Optional.ofNullable("test ok")
                .filter(Objects::nonNull)
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .ifPresentOrElse(
                        this::ok,
                        this::ko
                );
    }

    private void ko() {
        Assertions.fail();
    }

    private void ko(String s) {
        Assertions.fail();
    }

    private void ok(String s) {
        System.out.println(String.format("YES '{}' is a String", s));
    }

    private void ok() {
        System.out.println("We are not processing a String");
    }
}
