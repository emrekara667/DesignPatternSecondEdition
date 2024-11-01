package com.etech.designpattern.java8;

public class BiPredicateMainApp {
    public static void main(String[] args) {


        BiPredicate<String, String>  biPredicate = (s, s2) -> s.length() == s2.length();

        boolean test = biPredicate.test("emre", "sema");
        System.out.println(test);


    }
}
