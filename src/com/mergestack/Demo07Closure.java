package com.mergestack;

//Closure : When we return function it still Refers member variables from the scope it was return from.

public class Demo07Closure {

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Merge Stack";
            return () -> "Hello, " + name;
        };

        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
    }
}
