package com.etech.designpattern.java8;

@FunctionalInterface
public interface BiPredicate <T , U>{
    boolean test(T t, U u);
}
