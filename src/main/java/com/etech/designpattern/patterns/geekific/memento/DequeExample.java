package com.etech.designpattern.patterns.geekific.memento;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class DequeExample {


    public static void main(String[] args) {

        Deque<Object> stateHistory = new LinkedList<>(); // FIFO

        stateHistory.add("State 1");
        stateHistory.add("State 2");
        stateHistory.add("State 3");
        stateHistory.add("State 4");

        System.out.println("Current state history : " + stateHistory);
        Object pop = stateHistory.pop();
        System.out.println("popped : " + pop);
        System.out.println("Updated state history : " + stateHistory);
        System.out.println("Current state history : " + stateHistory);
        Object pop2 = stateHistory.pop();
        System.out.println("popped : " + pop2);
        System.out.println("Updated state history : " + stateHistory);

        System.out.println("Stack");

        Stack<String> stack = new Stack<>(); // LIFO
        stack.push("Stack State 1");
        stack.push("Stack State 2");
        stack.push("Stack State 3");
        stack.push("Stack State 4");


        System.out.println("Current state history : " + stack);
        String stackPop1 = stack.pop();
        System.out.println("popped : " + stackPop1);
        System.out.println("Updated state history : " + stack);
        String stackPop2 = stack.pop();
        System.out.println("popped : " + stackPop2);
        System.out.println("Updated state history : " + stack);


    }
}
