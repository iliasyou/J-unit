package com.example.junitexamples;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberEvenOrOddTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})

    public void  shouldReturnTrueWhenItsAnEvenNumber(int number) {
        String parity = NumberEvenOrOdd.checkNumberParity(number);
        assertEquals("Even", parity);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})

    public void  shouldReturnTrueWhenItsAnOddNumber(int number) {
        String parity = NumberEvenOrOdd.checkNumberParity(number);
        assertEquals("Oneven", parity);
    }
}

