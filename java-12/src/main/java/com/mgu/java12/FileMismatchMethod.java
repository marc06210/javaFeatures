package com.mgu.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
mismatch method compare deux fichiers et renvoie la position du premier octet qui diverge.
si les deux fichiers sont égaux alors -1 est renvoyé
 */
public class FileMismatchMethod {
    public static void main(String[] args) throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "Java 12 Article");
        Files.writeString(filePath2, "Java 12 Article");

        System.out.println("mismatch on two identical files: " + Files.mismatch(filePath1, filePath2) );

        filePath1 = Files.createTempFile("file1", ".txt");
        filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "Java 12 Article");
        Files.writeString(filePath2, "Java 11 Article");

        System.out.println("mismatch on two identical files: " + Files.mismatch(filePath1, filePath2) );
    }
}
