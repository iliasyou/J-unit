package com.example.junitexamples;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number < 2) {  // 0 en 1 zijn geen priemgetallen
            return false;
        }
        //Math.sqrt(number) berekent de vierkantswortel van een getal en wordt in dit geval gebruikt
        // om de bovengrens van de lus te bepalen bij het controleren van priemgetallen.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {  // Als het getal deelbaar is door i, is het geen priemgetal
                return false;
            }
        }
        return true;}
}
