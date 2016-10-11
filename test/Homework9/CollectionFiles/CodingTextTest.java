package Homework9.CollectionFiles;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingTextTest {

    @Test
    public void testCaesar() throws Exception {
        CodingText codingText = new CodingText();
        assertEquals("Плу!", codingText.caesar("Мир!"));
    }

    @Test
    public void testCaesarDeshifrator() throws Exception {
        CodingText codingText = new CodingText();
        assertEquals("Мир!", codingText.caesarDeshifrator("Плу!"));
    }
}