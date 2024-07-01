package com.coherentsolutions.java.webauto.section01;

/**
 * Demonstrates basic creation and usage of wrapper classes in Java.
 */
public class Ex01WrapperBasics {

    public static void main(String[] args) {
        // Creation of wrapper objects
        int i = 1;
        //Integer integer = new Integer(1);
        Integer integerObj = Integer.valueOf(682); // int -> Integer, char -> Character
        Double doubleObj = Double.valueOf(2.33);
        Boolean booleanObj = Boolean.valueOf(false);

        // Displaying the values of the wrapper objects
        System.out.println("Integer object value: " + integerObj);
        System.out.println("Double object value: " + doubleObj);
        System.out.println("Boolean object value: " + booleanObj);

        // Using some methods from the wrapper classes
        int intPrimitive = integerObj.intValue();
        double doublePrimitive = doubleObj.doubleValue();
        boolean booleanPrimitive = booleanObj.booleanValue();
        int sum = intPrimitive+i;

        // Displaying the converted primitive values
        System.out.println("Converted primitive values:");
        System.out.println("int: " + intPrimitive);
        System.out.println("double: " + doublePrimitive);
        System.out.println("boolean: " + booleanPrimitive);
    }
}
