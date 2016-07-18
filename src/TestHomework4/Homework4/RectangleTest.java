package Homework4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void area() throws Exception {
        Rectangle rectangle = new Rectangle(2, 2);
        double temp = rectangle.area();
        assertEquals(4, temp, 0);
    }

    @Test
    public void area1() throws Exception {
        Rectangle rectangle = new Rectangle(3, 2);
        double temp = rectangle.area();
        assertEquals(6, temp, 0);
    }

    @Test
    public void area2() throws Exception {
        Rectangle rectangle = new Rectangle(3, 3);
        double temp = rectangle.area();
        assertEquals(9, temp, 0);
    }
}
