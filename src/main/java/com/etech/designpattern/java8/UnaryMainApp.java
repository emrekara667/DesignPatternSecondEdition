package com.etech.designpattern.java8;

import com.etech.designpattern.patterns.geekific.command.components.Light;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UnaryMainApp {
    public static void main(String[] args) {


        List<String> list = Arrays.asList("GEEKIFIC", "OPERATORS");
        list.replaceAll(String::toLowerCase);

        System.out.println(list);

        Stream.of(20, 10, -40, 80, 30)
                .reduce(0, (a,b)-> a + b);


    }
}
