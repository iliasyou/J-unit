package com.example.junitexamples;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordReverserTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java", "Phyton", "Javascript", "Angular"})


       public void testReverseWord(String word) {
        String reversed = WordReverser.reverseWord(word);
        String expected = new StringBuilder(word).reverse().toString();
        assertEquals(expected, reversed);
    }
}
