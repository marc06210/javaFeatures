package com.mgu.java17;

/**
 * It requires to activate the support of the Java preview features.
 *
 */
public class SwitchPatternMatching {
    
    static String formatter(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (o instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (o instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }

    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case null      -> String.format("Ooops");
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
            default        -> o.toString();
        };
    }
    
    public static void main(String[] args) {
        System.out.println(formatterPatternSwitch(null));
        System.out.println(formatterPatternSwitch("hello world"));
    }
}
