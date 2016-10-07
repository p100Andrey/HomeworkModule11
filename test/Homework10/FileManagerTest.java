package Homework10;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class FileManagerTest {
    @Test(expected = org.junit.ComparisonFailure.class)
    public void testRead() throws Exception {
        File file = new File("TestFile");
        String str1 = "Hello, World!";
        FileManager.write(file, str1);
        assertEquals("Hello, World", FileManager.read(file));
    }

    @Test(expected = NullPointerException.class)
    public void testCheckNullRead() throws Exception {
        File file = new File("TestFile");
        String str1 = "Hello, World!";
        FileManager.write(file, str1);
        file = null;
        assertEquals("Hello, World!", FileManager.read(file));
    }

    @Test(expected = NullPointerException.class)
    public void testCheckNullWrite() throws Exception {
        File file = null;
        String str1 = "Hello, World!";
        FileManager.write(file, str1);
    }

    @Test
    public void testCheckNullWrite1() throws Exception {
        File file = new File("TestFile");
        String str1 = null;
        FileManager.write(file, str1);
    }
}