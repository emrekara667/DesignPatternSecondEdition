package com.etech.designpattern.java8;

@FunctionalInterface
public interface IntToDoubleFunction {
    double applyAsDouble(int value);
}
