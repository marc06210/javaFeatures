package com.mgu.java16.record;

public class RecordTest {

    public static void main(String[] args) {
        genericRecord();

        MySampleAsClass cl = new MySampleAsClass("doe", "john");
        MySampleAsRecord rec = new MySampleAsRecord("doe", "john");

        System.out.println(cl);
        System.out.println(rec);

        System.out.println(cl.getFirstname());
        System.out.println(rec.firstname());

    }

    static void genericRecord() {
        var parcel = new Parcel<>(
                new Table(), 200, 100, 55, 136.88);
        System.out.println(parcel);
    }
}

class Table {

}
