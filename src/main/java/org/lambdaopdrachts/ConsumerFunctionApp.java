package org.example;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class ConsumerFunctionApp {
    public static void main(String[] args) {
        //opdracht4
        BiConsumer<Integer, Integer> display = (a, b) -> System.out.println(a+b);
        display.accept(10,2);
        display.accept(12,3);
        BiFunction<Integer, Integer,String> function = (Integer i, Integer i2) -> {
            int newNumber = i * 4;
            return i + " changed into " + newNumber;

        };
        System.out.println(function.apply(5,10));
        System.out.println(function.apply(20,20));


    }
}
