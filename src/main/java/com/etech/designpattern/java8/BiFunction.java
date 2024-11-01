package com.etech.designpattern.java8;

import java.util.Objects;

public interface BiFunction <T, U, R>{
    R apply(T t, U u);

    default <V> BiFunction<T, U, V> andThen(MyFunction<? super R, ? extends V> after){
        Objects.requireNonNull(after);
        return (T t, U u) -> after.apply(apply(t, u));
    }
}
