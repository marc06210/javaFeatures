package com.mgu.java16;

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
    }
}
