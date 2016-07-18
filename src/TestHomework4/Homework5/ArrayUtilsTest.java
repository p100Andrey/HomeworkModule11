package Homework5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilsTest {

    @Test
    public void testMaximum() throws Exception {
        int[] testArray = new int[]{-5, 0, 5};
        assertEquals(5, ArrayUtils.maximum(testArray));
    }

    @Test
    public void testZeroMaximum() throws Exception {
        int[] testArray = new int[5];
        assertEquals(0, ArrayUtils.maximum(testArray));
    }

    @Test(expected = NullPointerException.class)
    public void testCheckNullMaximum() throws Exception {
        int[] testArray = null;
        assertEquals(5, ArrayUtils.maximum(testArray));
    }

    @Test
    public void testMinimum() throws Exception {
        int[] testArray = new int[]{-5, 0, 5};
        assertEquals(-5, ArrayUtils.minimum(testArray));
    }

    @Test
    public void testMinusMinimum() throws Exception {
        int[] testArray = new int[]{-5, -15, -1};
        assertEquals(-15, ArrayUtils.minimum(testArray));
    }

    @Test
    public void testPlusMinimum() throws Exception {
        int[] testArray = new int[]{5, 15, 1};
        assertEquals(1, ArrayUtils.minimum(testArray));
    }

    @Test
    public void testZeroMinimum() throws Exception {
        int[] testArray = new int[10];
        assertEquals(0, ArrayUtils.minimum(testArray));
    }
}