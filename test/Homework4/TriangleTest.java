package Homework4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void area() throws Exception {
        Triangle triangle = new Triangle(2, 2, 2);
        double temp = triangle.area();
        assertEquals(1.7320508075689, temp, 0.05);
    }

    @Test
    public void area1() throws Exception {
        Triangle triangle = new Triangle(1, 2, 3);
        double temp = triangle.area();
        assertEquals(0, temp, 0);
    }

    @Test
    public void area2() throws Exception {
        Triangle triangle = new Triangle(0, 0, 0);
        double temp = triangle.area();
        assertEquals(0, temp, 0);
    }

    @Test
    public void area3() throws Exception {
        Triangle triangle = new Triangle(-3, -2, -3);
        double temp = triangle.area();
        assertEquals(2.8284271247461903, temp, 0);
    }
}