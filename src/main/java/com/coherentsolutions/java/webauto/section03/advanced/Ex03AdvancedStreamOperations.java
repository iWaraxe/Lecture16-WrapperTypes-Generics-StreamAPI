package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates advanced stream operations including sorting, reducing, and complex filtering.
 */
public class Ex03AdvancedStreamOperations {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Stream", "Operations", "Java", "Filter", "Sort");

        // Filter and sort the list
        List<String> filteredSorted = words.stream()
                .filter(str -> str.startsWith("S"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Filtered and Sorted List: " + filteredSorted);

        // Reduce operation to concatenate strings
        String concatenated = words.stream()
                .reduce("", (a, b) -> a + b);

        System.out.println("Concatenated String: " + concatenated);

        // More complex operations using mapToInt and sum
        int totalLength = words.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println("Total length of all words: " + totalLength);
    }
}
