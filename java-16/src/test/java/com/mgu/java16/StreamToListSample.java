package com.mgu.java16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToListSample {
    void oldWay() {
        List<Integer> oldList = Stream.of(42)
                .collect(Collectors.toList());
    }

    void newWay() {
        List<Integer> newList = Stream.of(42)
                .toList();

        Assertions.assertThrows(UnsupportedOperationException.class,
                () -> newList.add(54));
    }
}
