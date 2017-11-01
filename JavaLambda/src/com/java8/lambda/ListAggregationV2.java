package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class ListAggregationV2 {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 3, 5, 2, 4, 6, 7);

		// System.out.println(aggregateV2(ints, (a, b) -> a + b));
		// System.out.println(aggregateV2(ints, (a, b) -> Math.min(a, b)));
		// System.out.println(aggregateV2(ints, (a, b) -> Math.max(a, b)));
		System.out.println(aggregateV2(ints, (a, b) -> (a | a) + 1)); // count { (a, b) -> (a|a) + 1) , (a, b) -> (a) + 1) }

	}

	// lambda => (a,b)->a+b;
	public static Integer aggregateV2(List<Integer> list, AggregateOperator operation) {
		Integer result = 0;
		for (Integer integer : list) {
			result = operation.operate(result, integer);
		}
		return result;
	}
}

@FunctionalInterface
interface AggregateOperator {
	public int operate(int a, int b);
}