package com.mgu.java14;

import static java.util.Calendar.*;

/*
 * https://openjdk.java.net/jeps/354
 * yield is introduced to make a difference between the value returned by a switch (which is not a function)
 * and the value returned by a function (which is sent back by return)
 */
public class SwitchSample {
    public static void main(String[] args) {
        System.out.println("oldSwitch -> " + oldSwitch(3));
        System.out.println("altSwitch -> " + intermediateSwitch(3));
        System.out.println("newSwitch -> " + newSwitch(3));
        canBeUsedAsAnExpression(7);
    }

    static int oldSwitch(int day) {
        int numLetters;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                numLetters = 8;
                break;
            case WEDNESDAY:
                numLetters = 9;
                break;
            default:
                throw new IllegalStateException("What: " + day);
        }
        return numLetters;
    }

    static int intermediateSwitch(int day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY:
                yield 6;
            case TUESDAY:
                yield 7;
            case THURSDAY, SATURDAY:
                yield 8;
            case WEDNESDAY:
                yield 9;
            default:
                throw new IllegalStateException("What " + day);
        };
    }

    static int newSwitch(int day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
            default -> throw new IllegalStateException("What " + day);
        };
    }

    static void canBeUsedAsAnExpression(int number) {
        System.out.println(switch(number) {
            case 1, 2, 3, 4 -> "little";
            case 5, 6, 7, 8 -> "some";
            default -> "a lot";
        });
    }
}



