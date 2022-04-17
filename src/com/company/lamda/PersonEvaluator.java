package com.company.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonEvaluator {
    private final List<Person> list = new ArrayList<>();

    public PersonEvaluator(List<Person> a) {
        this.list.addAll(a);
    }


    public void findAndPrint(int a) {
        System.out.println("Names of people older than 18 years");
        list.stream()
                .filter(l -> l.getAge() > a)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }

    public void findAndPrint() {
        System.out.println("Names starting from “P”");
        list.stream()
                .map(Person::getName)
                .filter(l -> l.charAt(0) == 'P')
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }

    public void groupAndPrint() {
        System.out.println("Group by age");
        Map<Integer, List<Person>> a = list.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println(a);


    }

    public void getAverageAge() {
        var buf = list.stream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println("Average age: " + buf / list.size());


    }


}
