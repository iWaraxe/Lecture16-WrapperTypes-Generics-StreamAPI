package com.coherentsolutions.java.webauto.section02.advanced;

import java.util.ArrayList;
import java.util.List;

/**
 * A generic class that can store any type of data.
 * @param <T> The type of data to store
 */
public class Box<T> {
    private T content;

    /**
     * Adds content to the box.
     * @param content The content of type T to be added
     */
    public void add(T content) {
        this.content = content;
    }

    /**
     * Retrieves the content from the box.
     * @return The content of type T
     */
    public T get() {
        return content;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.add(10);
        stringBox.add("Hello World");

        System.out.printf("Integer value: %d\n", integerBox.get());
        System.out.printf("String value: %s\n", stringBox.get());
    }
}
