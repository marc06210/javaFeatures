package com.mgu.java.java10;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnmodifiableListSample {
    void oldMethod() {
        var unmodifiableList = Stream.of(42)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }
    void newMethod() {
        var collect = Stream.of(42)
                .collect(Collectors.toUnmodifiableList());
    }
}
