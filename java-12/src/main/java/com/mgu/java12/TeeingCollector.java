package com.mgu.java12;

import java.util.Arrays;
import java.util.List;
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
        var listOfNumbers = new Integer[]{1, 2, 3, 4, 5};
        var sumOfElements = Stream.of(listOfNumbers)
                .collect(Collectors.summingDouble( i -> i));
        var numberOfElements = Stream.of(listOfNumbers)
                .collect(Collectors.counting());
        var meanValue = sumOfElements/numberOfElements;

        double mean = Stream.of(listOfNumbers)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));

        System.out.println("sum  : " + sumOfElements);
        System.out.println("count: " + numberOfElements);
        System.out.println("mean : " + meanValue);
        System.out.println(">>>>>: " + mean);
    }
}
