package com.etech.designpattern.java8;

import java.util.Objects;

@FunctionalInterface
public interface MyFunction<T, R> {
    R apply(T t);
    //R apply(int value);
    //R apply(long value);
    //R apply(double value);

    default <V> MyFunction<T, V> andThen(MyFunction<? super R, ? extends V> after){
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }

//    default <V> MyFunction<V, R> compose(MyFunction<? super V, ? extends T> before){
//        Objects.requireNonNull(before);
//        return (V v) -> apply(before.apply(v));
//    }
    // functional interface may contain one or several defaults methods.
}
