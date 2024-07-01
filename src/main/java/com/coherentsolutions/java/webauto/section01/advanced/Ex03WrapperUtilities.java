package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * Showcases utility methods provided by wrapper classes such as parsing strings and comparing values.
 */
public class Ex03WrapperUtilities {

    public static void main(String[] args) {
        // Parsing strings into primitive values
        int numInt = Integer.parseInt("123");
        double numDouble = Double.parseDouble("3.14159");

        // Comparing two numbers
        int comparisonResult = Integer.compare(20, 20);

        System.out.println("Parsed int: " + numInt);
        System.out.println("Parsed double: " + numDouble);
        System.out.println("Comparison result (10 vs 20): " + comparisonResult);

        // Converting primitive to string
        String intToString = Integer.toString(456);
        String doubleToString = Double.toString(123.456);

        System.out.println("Integer to String: " + intToString);
        System.out.println("Double to String: " + doubleToString);
    }
}
