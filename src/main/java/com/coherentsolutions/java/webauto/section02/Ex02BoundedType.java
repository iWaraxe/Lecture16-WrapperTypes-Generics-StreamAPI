package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates a generic method with bounded type parameters.
 */
public class Ex02BoundedType {

    /**
     * A generic method to find the maximum of three values.
     * @param a First value of type T
     * @param b Second value of type T
     * @param c Third value of type T
     * @param <T> Type parameter that extends Number and implements Comparable
     * @return The maximum value among the three provided
     */
    public static <T extends Number & Comparable<T>> T getMax(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "aaa";
        Double a = 2.2;
        Double b = 5.3;
        Double c = 8.1;
        Double max = getMax(a, b, c);
        System.out.println("The maximum value is: " + max);
    }
}
