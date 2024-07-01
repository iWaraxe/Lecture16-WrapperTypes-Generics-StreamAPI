package com.coherentsolutions.java.webauto.section03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Demonstrates various ways to create streams in Java.
 */
public class Ex02StreamCreation {

    public static void main(String[] args) {
        // Empty Stream
        Stream<String> emptyStream = Stream.empty();

        // Stream from a List
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Stream<String> listStream = list.stream();

        // Stream from an Array
        String[] array = new String[] {"Dog", "Cat", "Mouse"};
        Stream<String> arrayStream = Arrays.stream(array);

        // Stream of specific elements
        Stream<Integer> specificElementsStream = Stream.of(1, 2, 3);

        // Printing elements from each stream
        System.out.println("List Stream:");
        listStream.forEach(System.out::println);

        System.out.println("Array Stream:");
        arrayStream.forEach(System.out::println);

        System.out.println("Specific Elements Stream:");
        specificElementsStream.forEach(System.out::println);
    }
}
