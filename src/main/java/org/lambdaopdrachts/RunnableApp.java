package org.example;

public class RunnableApp {
    public static void main(String[] args) {
        Runnable function = () -> { System.out.println("oof"); };
        function.run();
//geen parameters meegeven ,geen returnwaards
    }
}
