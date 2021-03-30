package com.mgu.java.java10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListSampleTest {

    @Test
    void oldMethod() {
        var unmodifiableList = Stream.of(42)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        Assertions.assertThrows(UnsupportedOperationException.class,
                () -> unmodifiableList.add(54));
    }

    @Test
    void newMethod() {
        var collect = Stream.of(42)
                .collect(Collectors.toUnmodifiableList());

        Assertions.assertThrows(UnsupportedOperationException.class,
                () -> collect.add(54));

    }

    @Test
    void copyOf() {
        var firstList = Stream.of(5).collect(Collectors.toUnmodifiableList());
        var secondList = List.copyOf(firstList);

        Assertions.assertThrows(UnsupportedOperationException.class,
                () -> secondList.add(54));

        Assertions.assertEquals(firstList, secondList);
    }
}
