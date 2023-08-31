package com.example.junitexamples;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromesTest {
    @Test
    public void testIsPalindrome() {
        // Positieve gevallen
        assertTrue(Palindromes.isPalindrome("madam"));
        assertTrue(Palindromes.isPalindrome("Racecar"));
        assertTrue(Palindromes.isPalindrome("Able was I ere I saw Elba"));

        // Negatieve gevallen
        assertFalse(Palindromes.isPalindrome("hello"));
        assertFalse(Palindromes.isPalindrome("Java"));

        // Randgevallen
        assertFalse(Palindromes.isPalindrome(null));
        assertTrue(Palindromes.isPalindrome(""));
        assertTrue(Palindromes.isPalindrome("  ")); // met spaties
    }
}
