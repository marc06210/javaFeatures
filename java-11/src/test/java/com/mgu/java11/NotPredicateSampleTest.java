package com.mgu.java11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NotPredicateSampleTest {
    static List<String> originals = Arrays.asList("a", "", "b");

    @Test
    void testBothMethods() {
        var listOfFilteredStringoldWay = NotPredicateSample.filterWithoutNotPredicate(originals);
        var listOfFilteredStringNewWay = NotPredicateSample.filterUsingNotPredicate(originals);

        var expectedListOfNonEmptyStrings = Arrays.asList("a", "b");

        assertEquals(expectedListOfNonEmptyStrings, listOfFilteredStringoldWay);
        assertEquals(expectedListOfNonEmptyStrings, listOfFilteredStringNewWay);
    }
}