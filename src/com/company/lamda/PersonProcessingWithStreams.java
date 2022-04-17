package com.company.lamda;

import java.util.ArrayList;
import java.util.List;

public class PersonProcessingWithStreams {


    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Name", 0));
        list.add(new Person("Max", 28));
        list.add(new Person("Peter", 22));
        list.add(new Person("Anna", 28));
        list.add(new Person("Lilianna", 16));
        list.add(new Person("Pamela", 13));
        list.add(new Person("David", 22));


        PersonEvaluator personEvaluator = new PersonEvaluator(list);
        personEvaluator.findAndPrint();

        System.out.println("\n");

        personEvaluator.findAndPrint(18);

        System.out.println("\n");

        personEvaluator.groupAndPrint();

        System.out.println("\n");

        personEvaluator.getAverageAge();

    }

}
