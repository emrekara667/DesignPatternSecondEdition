package com.etech.designpattern.java8;

import java.util.Objects;

public interface Predicate <T>{
    boolean test(T t);

    default Predicate<T> and (Predicate<? super T> other){
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }

    default Predicate<T> or(Predicate<? super T> other){
        Objects.requireNonNull(other);
        return t -> test(t) || other.test(t);
    }

    default Predicate<T> negate(){
        return t -> !test(t);
    }

    // it takes one parameter of any type as input always returns boolean
}
