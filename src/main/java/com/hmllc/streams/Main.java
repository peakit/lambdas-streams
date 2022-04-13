package com.hmllc.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // From list to Stream
        List<String> fruits = new ArrayList<>();
        fruits.add("kiwi");
        fruits.add("papaya");
        fruits.add("pineapple");
        fruits.add("apple");

        // Streams are immutable and only meant for performing operations and not for storing elements
        Stream<String> fruitsStream = fruits.stream();
        fruitsStream.sorted()
                .map(item -> item.toUpperCase(Locale.ROOT))
                .filter(item -> !item.startsWith("P"))
                .forEach(item -> System.out.println(item));

        // original backend remains immutable
        System.out.println(fruits);

        // stream once processed gets closed
        //java.lang.IllegalStateException: stream has already been operated upon or close
        //fruitsStream.forEach(iteam -> System.out.println(iteam));

        // From Arrays to Stream
        Integer[] intArray = {1,2,3,4,5};
        Stream<Integer> intStream = Arrays.stream(intArray);
        intStream.forEach(i -> System.out.println(i));

        List<String> letters = Stream.of("a", "b", "c")
                .sorted((String a,String b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(letters);
    }
}
