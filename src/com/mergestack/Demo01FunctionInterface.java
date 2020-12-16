package com.mergestack;
import java.util.function.Function;

public class Demo01FunctionInterface {
    protected static class MyMath {
        public static Integer triple(Integer x) {
            return x * 3;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> myTriple = MyMath::triple; //Refering Method as object here
        Integer result = myTriple.apply(5);
        System.out.println(result);
    }
}
