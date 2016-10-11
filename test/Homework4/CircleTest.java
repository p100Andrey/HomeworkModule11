package Homework4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CircleTest {
    @Test
    public void testArea() throws Exception {
        Circle circle = new Circle(2);
        int temp = (int) circle.area();
        assertEquals(12, temp);
    }

    @Test
    public void testAreaNull() throws Exception {
        Circle circle = new Circle(2);
        assertTrue(3.141592653589793*4 == circle.area());
    }


}