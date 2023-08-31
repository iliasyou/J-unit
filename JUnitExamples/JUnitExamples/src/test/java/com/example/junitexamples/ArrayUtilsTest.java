package com.example.junitexamples;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayUtilsTest {
    @Test
   public void shoulddReturnTrueWhenItsSmallestNumber() {
        int[] numbers = {5, 2, 8, 1, 10};
        int smallest = ArrayUtils.findSmallestNumber(numbers);
        assertEquals(1, smallest);
    }

    @Test
    public void testFindSmallestNumber_EmptyArray() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.findSmallestNumber(numbers);
        });
    }

    @Test
    public void testFindSmallestNumber_NullArray() {
        int[] numbers = null;
        assertThrows(IllegalArgumentException.class, () -> {
            ArrayUtils.findSmallestNumber(numbers);
        });
    }
}
