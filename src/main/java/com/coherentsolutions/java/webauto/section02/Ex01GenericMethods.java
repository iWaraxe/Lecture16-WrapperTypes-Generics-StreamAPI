package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the use of a generic method to print array elements.
 */
public class Ex01GenericMethods {

    /**
     * A generic method to print array elements.
     * @param arr Array of any type
     * @param <T> The type of the elements in the array
     */
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }

    public static void printIntegerArray(Integer[] arr) {
        for (Integer element : arr) {
            System.out.println(element);
        }
    }

    public static void printStringArray(String[] arr) {
        for (String element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {2, 5, 6};
        printArray(intArray);

        String[] stringArray = {"Hello", "World"};
        printArray(stringArray);
    }
}
