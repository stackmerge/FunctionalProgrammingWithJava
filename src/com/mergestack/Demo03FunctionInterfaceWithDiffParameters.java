package com.mergestack;
import java.util.function.BiFunction;

public class Demo03FunctionInterfaceWithDiffParameters {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(32, 32));
        
        //Defined by User it works exactly like inbuilt
        TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y + z;
        System.out.println(addThree.apply(54, 3, 4));
        
      //Defined by User it works exactly like inbuilt
        NoArgFunction<String> sayHello = () -> "Hello!";
        System.out.println(sayHello.apply());
    }
}
