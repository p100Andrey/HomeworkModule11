package Homework4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void area() throws Exception {
        Circle circle = new Circle(2);
        double temp = circle.area();
        assertEquals(12.566368, temp, 0.00001);
    }

    @Test
    public void area1() throws Exception {
        Circle circle = new Circle(3);
        double temp = circle.area();
        assertEquals(28.274328, temp, 0.00001);
    }

    @Test
    public void area2() throws Exception {
        Circle circle = new Circle(1);
        double temp = circle.area();
        assertEquals(3.141592, temp, 0.00001);
    }
}