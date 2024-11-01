package com.etech.designpattern.java8;

public class BiMainApp {
    public static void main(String[] args) {


        BiFunction<Integer, Integer, Integer> biFunction = (t, u) -> t * u;
        Integer result = biFunction.apply(6, 6);
        System.out.println(result);


    }
}
