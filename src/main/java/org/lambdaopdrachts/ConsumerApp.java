package org.example;


import java.util.Scanner;
import java.util.function.Consumer;


public class ConsumerApp {
    public static void main(String[] args) {
//consumer for input
        Consumer<String>function=(String food)->
                System.out.println("Eating a "+food);
        function.accept("cookie");
//vraagt een parameter ,en geen returnwaade
       // opdracht 2
        Scanner scan=new Scanner(System.in);
        System.out.println("Give your age please?");
        int input=scan.nextInt();
        Consumer <Integer>consumer=(Integer age ) ->{
            if(age<=18){
                System.out.println("you are small");
            }else{
                System.out.println("you are too old");
            }

        };
        consumer.accept(input);
    }

}