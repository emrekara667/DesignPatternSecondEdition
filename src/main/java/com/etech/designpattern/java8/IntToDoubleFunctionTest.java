package com.etech.designpattern.java8;

public class IntToDoubleFunctionTest {
    public static void main(String[] args) {


        IntToDoubleFunction divideFunction = t-> t / 3.0;
        System.out.println(divideFunction.applyAsDouble(12));


    }
}
