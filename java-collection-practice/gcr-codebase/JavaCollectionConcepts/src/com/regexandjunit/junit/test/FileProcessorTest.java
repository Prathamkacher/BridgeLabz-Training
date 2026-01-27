package com.regexandjunit.junit.test;

import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.testingfilehandling.FileProcessor;

import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    FileProcessor processor = new FileProcessor();
    String filename = "testfile.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        String data = "Hello JUnit";

        processor.writeToFile(filename, data);
        String readData = processor.readFromFile(filename);

        assertEquals(data, readData);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(filename, "Test Data");

        File file = new File(filename);
        assertTrue(file.exists());
    }

    @Test
    void testReadNonExistingFile() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nofile.txt");
        });
    }
}
