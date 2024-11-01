package com.etech.designpattern.java8;

import java.util.function.BiFunction;

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, T, T> {
}
