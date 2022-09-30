package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApp {

    public static void main(String[] args) {
        //opdracht 5
        IntStream.of(5,8,640,1111,27,16)
                .filter(n->n%8==0)
                .map(n->n/4)
                .forEach(n-> System.out.println(n));
        //opdracht6
        List<String> animals = new ArrayList<>();
        animals.add("Cow");
        animals.add("ShaRk");
        animals.add("DOg");
        animals.add("PirAnha");
        animals.add("MouSE");
        animals.add("CaT");
        animals.add("ParRoT");
        animals.add("DOLphin");
       // animals.forEach( (n) -> { System.out.println(n); } );
        List<String>newAnimals=animals.stream().filter(word->word.contains("a")).map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Animals with lowercase and whose names with alphabet a are:");
       newAnimals.forEach( (n) -> {System.out.println(n); } );
        Collections.sort(newAnimals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }else{
                   return o1.compareTo(o2) ;
                }
            }
        });
        System.out.println("Sorted by AnimalsNames according to length: "+newAnimals);
    }
}




