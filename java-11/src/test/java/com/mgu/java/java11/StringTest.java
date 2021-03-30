package com.mgu.java.java11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {

    private String multiLineString = "This is a string \n with multiple \n \n lines";

    @Test
    public void testLinesMethod() {
        Assertions.assertEquals(multiLineString.lines().count(), 4);
    }

    @Test
    public void testIsBlanck() {
        Assertions.assertEquals(multiLineString.lines()
                .filter(s -> !s.isBlank()).count(), 3);
    }

    @Test
    public void testStrip() {
        var nonStrippedString =  "  blabla    ";
        Assertions.assertEquals("blabla", nonStrippedString.strip());
        Assertions.assertEquals("  blabla", nonStrippedString.stripTrailing());
        Assertions.assertEquals("blabla    ", nonStrippedString.stripLeading());
    }
}
