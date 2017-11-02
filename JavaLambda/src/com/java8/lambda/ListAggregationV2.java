package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class ListAggregationV2 {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(20,1, 3, 5, 2, 4, 6, 7, 10);		
		
		// System.out.println(perfom(ints, (a, b) -> a + b));
		// System.out.println(perfom(ints, (a, b) -> Math.min(a, b)));
		// System.out.println(perfom(ints, (a, b) -> Math.max(a, b)));
		//System.out.println(perfom(ints, (a, b) -> ints.size()));
	}

	// lambda => (a,b)->a+b;
	public static Integer perfom(List<Integer> list, AggregateOperator operation) {
		Integer result = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			Integer integer = list.get(i);
			result = operation.operate(result, integer);
		}
		return result;
	}
}

@FunctionalInterface
interface AggregateOperator {
	public int operate(int a, int b);
}