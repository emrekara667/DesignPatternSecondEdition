package com.etech.designpattern.java8;

public class MainApp {
    public static void main(String[] args) {
//        MyFunction<Double, Double> divideFunction = t -> t / 3.0;
//        MyFunction<Double, Double> subtractFunction = t -> t - 2.0;
//        Object andThenResult = divideFunction.andThen(subtractFunction).apply(12.0);
//        Object composeResult = divideFunction.compose(subtractFunction).apply(12.0);
//        System.out.println("and then " + andThenResult);
//        System.out.println("compose " + composeResult);

//        IntToDoubleFunction divideFunction = t -> t / 3.0;
//        double result = divideFunction.applyAsDouble(12);
//        System.out.println("result -> " + result);
//
//
//
//        MyFunction<Customer, Object> myFunction = customer -> customer.getId() + 3;
//
//        List<Object> emrekara = List.of(new Customer(113, "emrekara"))
//                .stream()
//                .map(myFunction::apply)
//                .collect(Collectors.toList());
//
//        System.out.println(emrekara);

        MyFunction<Double, Double> divideFunction = t -> t / 3.0;
        //divideFunction.apply(12.0);

    }
}
