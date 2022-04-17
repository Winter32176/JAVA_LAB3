package com.company.lamda;

import java.util.List;

public class ListProcessingWithStreams {

    public static void main(String[] args) {
        //Exercise 1
        List<String> list = List.of("a1", "c3", "a2", "a3","b3", "b2", "c1", "c2","b1");
        System.out.printf("First element %s", list.get(0));

        separator();

        //Exercise 2
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        separator();

        //Exercise 3
        list.stream()
                .filter(list_f -> list_f.contains("b"))
                .forEach(System.out::println);

        separator();

        //Exercise 4
        list.stream()
                .filter(list_f -> list_f.contains("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);



    }

    private static void separator() {
        System.out.println("\n");
    }
}
