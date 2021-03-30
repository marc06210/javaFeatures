package com.mgu.java16.record;


import java.lang.reflect.Field;


class NoteBook {
    private final int pageCount;
    public NoteBook(int pageCount) {
        this.pageCount = pageCount;
    }
    public int getPageCount() {
        return pageCount;
    }
    @Override
    public String toString() {
        return "NoteBook{" + "pageCount=" + pageCount + '}';
    }
}

record Point(int x, int y) {
}

/*
Records are truly immutable – you can’t change their field values using reflection ( if you haven’t tried it out yet,
 you can change the value of immutable strings using reflection)

The following code confirms that the private and final fields of a (regular) class can be changed using reflection,
but records are a harder nut to crack
 */
public class UseReflectionSample {
    public static void main(String[] args) throws Exception {
        changeFinalFieldValuesForNonRecords();
        changeFinalForRecords();
    }
    private static void changeFinalFieldValuesForNonRecords()
            throws NoSuchFieldException, IllegalAccessException {
        final var noteBook = new NoteBook(10);
        System.out.println(noteBook);
        Field pageField = noteBook.getClass().getDeclaredField("pageCount");
        pageField.setAccessible(true);
        int newCount = 1000;
        pageField.setInt(noteBook, newCount);
        System.out.println(noteBook);
    }
    private static void changeFinalForRecords()
            throws NoSuchFieldException, IllegalAccessException {
        final var point = new Point(12, 35);
        System.out.println(point);
        Field xField = point.getClass().getDeclaredField("x");
        xField.setAccessible(true);
        int newVal = 1000;
        xField.setInt(point, newVal);
        System.out.println(point);
    }
}

