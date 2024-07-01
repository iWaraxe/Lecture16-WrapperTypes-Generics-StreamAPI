package com.coherentsolutions.java.webauto.section03;

import java.util.stream.IntStream;

/**
 * Demonstrates basic stream operations including filtering, mapping, and iteration.
 */
public class Ex01BasicStreamOperations {

    public static void main(String[] args) {
        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120)
                .filter(x -> x < 90)
                .map(x -> x + 10)
                .limit(3)
                .forEach(System.out::println);

        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x += 10;
            count++;
            if (count > 3) break;
            System.out.print(x);
        }

    }
}
