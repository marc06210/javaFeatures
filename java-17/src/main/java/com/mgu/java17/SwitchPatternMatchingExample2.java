package com.mgu.java17;

/**
 * It requires to activate the support of the Java preview features.
 *
 */
public class SwitchPatternMatchingExample2 {
    
    private static String aVeryLongString = """
            this is a string containing at least one line
                and i also add a new one, please have a look at the indentation
                
            and a final "one" after an empty one with special characters
            """;
    static void testTriangle(Shape s) {
        switch (s) {
            case null:
                System.out.println("A null object is definitely not a triangle");
                break;
            case Triangle t:
                if (t.calculateArea() > 100) {
                    System.out.println("Large triangle");
                    break;
                }
            default:
                System.out.println("A shape, possibly a small triangle");
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println(aVeryLongString);
//        testTriangle(null);
//        testTriangle(new Triangle(12));
//        testTriangle(new Triangle(1200));
    }
}

class Shape { }

class Rectangle extends Shape { }

class Triangle extends Shape {
    int size;
    public Triangle(int size) {
        this.size = size;
    }
    int calculateArea() {
        return size;
    }
}