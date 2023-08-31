package com.example.junitexamples;


import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class FactorialTest {
    @TestFactory
    public Collection<DynamicTest> testCalculateFactorial() {
        return Arrays.asList(
                dynamicTest("Factorial of 0", () -> {
                    int result = Factorial.calculateFactorial(0);
                    assertEquals(1, result);
                }),
                dynamicTest("Factorial of 3", () -> {
                    int result = Factorial.calculateFactorial(3);
                    assertEquals(6, result);
                }),
                dynamicTest("Factorial of 5", () -> {
                    int result = Factorial.calculateFactorial(5);
                    assertEquals(120, result);
                }),
                dynamicTest("Factorial of 10", () -> {
                    int result = Factorial.calculateFactorial(10);
                    assertEquals(3628800, result);
                })
        );
    }
}
