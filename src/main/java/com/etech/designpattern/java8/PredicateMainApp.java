package com.etech.designpattern.java8;

import java.util.List;
import java.util.stream.Collectors;

public class PredicateMainApp {
    public static void main(String[] args) {
        Predicate<String> isContainE = t-> t.contains("e");
        boolean test = isContainE.test("se");
        System.out.println(test);
        List<String> nameList = List.of("emre", "sema", "mert");
        List<String> collect = nameList.stream()
                .filter(isContainE::test)
                .collect(Collectors.toList());
        System.out.println(collect);

        Predicate<String> firstPredicate = s -> s.startsWith("Geek");
        Predicate<String> secondPredicate = s -> s.length() == 8;

        boolean andResult = firstPredicate.and(secondPredicate).test("Geekific");
        System.out.println("andResult " + andResult);

        Predicate<String> orPredicate = o -> o.startsWith("Gee") || o.length() == 4;
        orPredicate.test("Geekific");


    }
}
