package org.example;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String,Integer> function = (String a) -> a.length();
        System.out.println(function.apply("cookie"));
        System.out.println(function.apply("Rama Sharma"));
//vraagt een parametr,geeft returnwaardes
    }
}
