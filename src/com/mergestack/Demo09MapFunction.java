package com.mergestack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo09MapFunction {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
		// Typical procedural way

		List<Integer> doubled1 = new ArrayList<>();

		for (int i = 0; i < listOfIntegers.size(); i++) {
			Integer result = listOfIntegers.get(i) * 2;
			doubled1.add(result);
		}

		System.out.println(doubled1);

		// Functional Programming way where we dont need to worry
		// about looping, indexing and creating new list
		Function<Integer, Integer> timesTwo = (x) -> x * 2;

		List<Integer> doubled = listOfIntegers.stream() // Pipelined way/ Java Stream
				.map(timesTwo) // Take list and apply function on each record and return stream
				.collect(Collectors.toList()); // Stream to List back

		System.out.println(doubled);
	}
}
