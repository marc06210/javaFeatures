package com.mgu.java16.record;

/*
Since the state of a record is defined using components in its declaration, it doesn’t make much sense to allow the
addition of instance variables (or fields) to a record.
However, you can add static fields, and instance or static methods to a record, if you need them.
 */
public record Person(String name, int age) {
    public Person {
        instanceCount++;
    }

    private static int instanceCount;
    static int getInstanceCount() {
        return instanceCount;
    }
}
