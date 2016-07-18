package Homework10;

import Homework5.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class MainTest {
//    File file = new File("TestFile");


    @Test(expected = org.junit.ComparisonFailure.class)
    public void testRead() throws Exception {
        File file = new File("TestFile");
        String str1 = "Hello, World!";
        Main.write(file, str1);
        assertEquals("Hello, World", Main.read("TestFile", file));
    }

    @Test(expected = NullPointerException.class)
    public void testCheckNullRead() throws Exception {
        File file = new File("TestFile");
        String str1 = "Hello, World!";
        Main.write(file, str1);
        file = null;
        assertEquals("Hello, World!", Main.read("TestFile", file));
    }

    @Test(expected = NullPointerException.class)
    public void testCheckNullWrite() throws Exception {
        File file = null;
        String str1 = "Hello, World!";
        Main.write(file, str1);
    }

    @Test
    public void testCheckNullWrite1() throws Exception {
        File file = new File("TestFile");
        String str1 = null;
        Main.write(file, str1);
    }
}
