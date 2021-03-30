package com.mgu.java.java11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesTest {

    static final String content = "Sample content";

    @Test
    public void testReadAndWriteMethod() throws IOException {
        Path filePath = Files.writeString(Files.createTempFile(Path.of("."), "junit", ".txt"), content);
        String fileContent = Files.readString(filePath);
        Assertions.assertEquals(content, fileContent);
    }
}
