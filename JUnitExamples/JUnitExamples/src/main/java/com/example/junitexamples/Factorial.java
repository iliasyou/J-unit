package com.example.junitexamples;

public class Factorial {
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Het getal mag niet negatief zijn.");
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
