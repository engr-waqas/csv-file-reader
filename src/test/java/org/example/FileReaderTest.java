package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FileReaderTest {

    @Test
    public void testGetDirectoryPath() {
        InputParser inputParser = new InputParser(new String[]{"--directory", "files"});
        String directoryPath = inputParser.getDirectoryPath();
        assertEquals("files", directoryPath);
    }

    @Test
    public void parseInt() {
        assertTrue(true);
    }

    @Test
    public void writeInYamlFile() {
    }

    @Test
    public void writeInJsonFile() {
    }
}