package com.mergestack;

import java.util.function.Function;

public class Demo02LamdaExpression {

	public static void main(String[] args) {
		Function<Integer, Integer> absoluteValue = (x) -> {
			if (x < 0) {
				return -x;
			} else {
				return x;
			}
		};

		Function<Integer, Integer> absoluteValue1 = (x) -> x < 0 ? -x : x;
		
		Function<Integer, Integer> absoluteValue2 = (Integer x) -> x < 0 ? -x : x;

		Function<Integer, Integer> absoluteValue3 = x -> x < 0 ? -x : x;

		System.out.println(absoluteValue.apply(-100));
		System.out.println(absoluteValue1.apply(-100));
		System.out.println(absoluteValue2.apply(-100));
		System.out.println(absoluteValue3.apply(-100));
	}
}
