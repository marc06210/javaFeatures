package com.mgu.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Composition of two collectors.
Each element is treated by both collectors.
When done the result of the two collectors is injected into a merge function.

The following example returns the average value of a list of doubles.
First collector sum all values.
Second collector counts number of values.
The merge function divides the sum by the number of elements.
 */
public class TeeingCollector {

    public static void main(String[] args) {
        var sumOfElements = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.summingDouble( i -> i));
        System.out.println(sumOfElements);

        var numberOfElements = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.counting());
        System.out.println(numberOfElements);

        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
        System.out.println(mean);
    }
}
