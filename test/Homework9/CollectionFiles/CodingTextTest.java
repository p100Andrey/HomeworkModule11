package Homework9.CollectionFiles;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingTextTest {

    @Test
    public void testCaesar() throws Exception {
        CodingText codingText = new CodingText();
        assertEquals("Плу!", codingText.caesar("Мир!"));
    }

    @Test(expected = NullPointerException.class)
    public void testChackNullCaesar() throws Exception {
        CodingText codingText = null;
        assertEquals("Плу!", codingText.caesar("Мир!"));
    }

    @Test
    public void testCaesarDeshifrator() throws Exception {
        CodingText codingText = new CodingText();
        assertEquals("Мир!", codingText.caesarDeshifrator("Плу!"));
    }

    @Test(expected = org.junit.ComparisonFailure.class)
    public void testComparisonFailureCaesarDeshifrator() throws Exception {
        CodingText codingText = new CodingText();
        assertEquals("Мир!", codingText.caesarDeshifrator("754"));
    }
}