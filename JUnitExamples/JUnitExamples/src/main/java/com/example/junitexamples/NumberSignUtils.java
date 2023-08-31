package com.example.junitexamples;

public class NumberSignUtils {
    public static String checkNumberSign(int number) {
        if (number > 0) {
            return "Positief";
        } else if (number < 0) {
            return "Negatief";
        } else {
            return "Nul";
        }
    }
}
