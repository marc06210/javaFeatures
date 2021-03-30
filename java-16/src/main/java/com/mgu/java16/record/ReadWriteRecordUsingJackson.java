package com.mgu.java16.record;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteRecordUsingJackson {
    public static void main(String[] args) {
        var rectangle = new Rectangle(20, 60);
        writeToFileUsingJackson(rectangle);
        System.out.println(readFromFileUsingJackson());
    }
    static void writeToFileUsingJackson(Object obj) {
        try {
            new ObjectMapper()
                    .writeValue(new FileOutputStream(getFile()),
                            obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static Object readFromFileUsingJackson() {
        Object retValue = null;
        try {
            retValue = new ObjectMapper()
                    .readValue( new FileInputStream(getFile()),
                            Rectangle.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retValue;
    }
    private static File getFile() {
        return new File("mydata.json");
    }
}
