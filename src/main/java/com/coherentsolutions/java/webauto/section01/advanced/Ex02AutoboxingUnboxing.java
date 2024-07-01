package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * Demonstrates autoboxing and unboxing in Java.
 * Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
 * Unboxing is the reverse process where the object wrapper class is converted back to a primitive type.
 */
public class Ex02AutoboxingUnboxing {

    public static void main(String[] args) {
        // Autoboxing: Automatically converting a primitive type to a corresponding wrapper object
        Integer integerObj = 50;  // Compiler converts int to Integer object
        Double doubleObj = 3.14;  // Compiler converts double to Double object
        Character charObj = 'a';  // Compiler converts char to Character object

        // Unboxing: Automatically converting a wrapper object to a primitive type
        int i = integerObj;       // Compiler converts Integer object to int
        double d = doubleObj;     // Compiler converts Double object to double
        char c = charObj;         // Compiler converts Character object to char

        // Displaying the results of autoboxing and unboxing
        System.out.println("Autoboxed objects:");
        System.out.println("Integer object: " + integerObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);

        System.out.println("Unboxed values:");
        System.out.println("int: " + i);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
    }
}
