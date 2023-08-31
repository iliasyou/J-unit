package com.example.junitexamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSignUtilsTest {
    @Test
    public void  shouldReturnTrueWhenItsAPositiveNumber() {
        int number = 10;
        String sign = NumberSignUtils.checkNumberSign(number);
        assertEquals("Positief", sign);
    }

    @Test
    public void  shouldReturnTrueWhenItsANegativeNumber() {
        int number = -5;
        String sign = NumberSignUtils.checkNumberSign(number);
        assertEquals("Negatief", sign);
    }

    @Test
    public void  shouldReturnTrueWhenItsZero() {
        int number = 0;
        String sign = NumberSignUtils.checkNumberSign(number);
        assertEquals("Nul", sign);
    }
}
