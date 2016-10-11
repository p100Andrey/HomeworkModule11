package Homework10;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class FileManagerTest {
    @Test
    public void testRead() throws Exception {
        File file = new File("TestFile");
        String str1 = "Hello, World!";
        FileManager.write(file, str1);
        assertEquals("Hello, World!", FileManager.read(file));
    }
}