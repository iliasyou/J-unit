package com.example.junitexamples;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class PrimeNumberTest {

    @TestFactory

    public Collection<DynamicTest> testIsPrime() {

        return Arrays.asList(

                dynamicTest("Check if 2 is prime", () -> {

                    boolean result = PrimeNumber.isPrime(2);

                    assertEquals(true, result);

                }),


    dynamicTest("Check if 10 is geen prime",() ->

    {

        boolean result = PrimeNumber.isPrime(10);

        assertEquals(false, result);

    }),

    dynamicTest("Check if 17 is prime",() ->

    {

        boolean result = PrimeNumber.isPrime(17);

        assertEquals(true, result);

    })

            );

}}