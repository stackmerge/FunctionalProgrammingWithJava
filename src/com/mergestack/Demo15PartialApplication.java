package com.mergestack;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo15PartialApplication {

	public static void main(String[] args) {
		TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;

		//Approach 1
		Function<Integer, BiFunction<Integer, Integer, Integer>> addPartial = (x) -> (y, z) -> add.apply(x, y, z);

		BiFunction<Integer, Integer, Integer> add5 = addPartial.apply(5);

		System.out.println(add5.apply(6, 7));
		
		//Approach 2
		BiFunction<Integer, Integer, Function<Integer, Integer>> addPartial1 =
				(x,y) -> (z) -> add.apply(x, y, z);
				
		Function<Integer, Integer> add5and6 = addPartial1.apply(5, 6);
		
		System.out.println(add5and6.apply(7));

	}
}
