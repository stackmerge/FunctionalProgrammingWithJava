package com.mergestack;

import java.util.function.Function;
import java.util.function.BiFunction;

public class Demo08HigherOrderFunction {

	public static void main(String[] args) {

		// Without Higher Order Function
		BiFunction<Float, Float, Float> divide = (x, y) -> {
			if (y == 0f) {
				System.out.println("Error: second argument is zero!");
				return 0f;
			}
			return x / y;
		};

		// With Higher Order Function
		BiFunction<Float, Float, Float> divide1 = (x, y) -> x / y;

		Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZeroCheck = (
				func) -> (x, y) -> {
					if (y == 0f) {
						System.out.println("Error: second argument is zero!");
						return 0f;
					}
					return func.apply(x, y);
				};

		BiFunction<Float, Float, Float> divideSafe = secondArgIsntZeroCheck.apply(divide1);

		System.out.println(divideSafe.apply(10f, 2f));
	}
}
