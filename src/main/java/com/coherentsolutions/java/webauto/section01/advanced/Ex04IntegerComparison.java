package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * Demonstrates the comparison of Integer objects to illustrate that they are reference types.
 * This example covers using '==' and '.equals()' for comparisons, showcasing the potential pitfalls and correct usage.
 */
public class Ex04IntegerComparison {

    public static void main(String[] args) {
        // Creating Integer instances using new
        Integer intObj1 = new Integer(100);
        Integer intObj2 = new Integer(100);

        // Creating Integer instances using valueOf
        Integer intObj3 = Integer.valueOf(100);
        Integer intObj4 = Integer.valueOf(100);

        // Comparison using '=='
        System.out.println("Comparing intObj1 and intObj2 with '==': " + (intObj1 == intObj2)); // false, different references
        System.out.println("Comparing intObj3 and intObj4 with '==': " + (intObj3 == intObj4)); // true, same references from Integer cache

        // Comparison using '.equals()'
        System.out.println("Comparing intObj1 and intObj2 with '.equals()': " + intObj1.equals(intObj2)); // true, same values
        System.out.println("Comparing intObj3 and intObj4 with '.equals()': " + intObj3.equals(intObj4)); // true, same values

        // Advanced example with automatic caching range
        Integer intObj5 = Integer.valueOf(127); // Edge of the default caching range
        Integer intObj6 = Integer.valueOf(127);
        Integer intObj7 = Integer.valueOf(128); // Outside of the default caching range
        Integer intObj8 = Integer.valueOf(128);

        System.out.println("Comparing intObj5 and intObj6 with '==': " + (intObj5 == intObj6)); // true, same references from Integer cache
        System.out.println("Comparing intObj7 and intObj8 with '==': " + (intObj7 == intObj8)); // false, different references outside cache
    }
}
