package org.example;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        //supplier for output

        Supplier<String> function = () -> {
            String time = LocalTime.now().toString();
            return "The time right now is: "+time;};
        System.out.println(function.get());
        //Geen parameter,wel returnwaardes
//opdracht3
        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(4);
        };


        Function<Integer, String> function1 = (Integer i) -> {

            double newNumber = (double)i / 4*100;

            return i + " changed into " + newNumber;
        };
        System.out.println(function1.apply(supplier.get()));

    }
}
