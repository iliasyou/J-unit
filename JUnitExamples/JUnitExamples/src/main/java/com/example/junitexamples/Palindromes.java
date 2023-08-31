package com.example.junitexamples;

public class Palindromes {
    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        // Trimmen van spaties
        word = word.trim();

        // Controleren op lege string
        if (word.isEmpty()) {
            return true;
        }

        // Hoofdlettergevoeligheid
        word = word.toLowerCase();

        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
