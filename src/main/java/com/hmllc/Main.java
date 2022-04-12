package com.hmllc;

import java.util.Random;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };
        greeting2.sayHello();

        Greeting greeting3 = () -> System.out.println("Hello World");
        greeting3.sayHello();

        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(5);
            return x * y + randomNumber;
        };
        System.out.println(calculator.calculate(1,3));

        BiFunction<Integer, Integer, Integer> calculator2 = (Integer x, Integer y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(5);
            return x * y + randomNumber;
        };
        System.out.println(calculator2.apply(1, 2));
        
    }

}
