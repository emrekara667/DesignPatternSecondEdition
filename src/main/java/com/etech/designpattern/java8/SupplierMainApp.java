package com.etech.designpattern.java8;

import java.util.List;
import java.util.stream.Stream;

public class SupplierMainApp {
    public static void main(String[] args) {


        Supplier<Double> supplier = Math::random;
        Double v = supplier.get();
        System.out.println(v);

        List<Double> tenRandomNbrs = Stream.generate(supplier::get)
                .limit(10)
                .toList();
        System.out.println(tenRandomNbrs);


        Stream.generate(()-> "Geekific")
                .limit(10)
                .forEach(System.out::println);


        Consumer<String> c1 = s1 -> System.out.println(s1 + "cosumer 1 : ");
        Consumer<String> c2 = s2 -> System.out.println(s2 + "cosumer 2 : ");

        c1.andThen(c2).accept("Emre Kara : ");


    }
}
