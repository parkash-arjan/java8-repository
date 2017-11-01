package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class ListAggregation {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 3, 5, 2, 4, 6, 7);

		Aggregator sum = new Aggregator() {
			@Override
			public Integer aggregate(List<Integer> list) {
				int sum = 0;
				for (Integer integer : ints) {
					sum = sum + integer;
				}
				return sum;

			}

		};

		aggregate(ints, sum);

		Aggregator average = new Aggregator() {
			@Override
			public Integer aggregate(List<Integer> list) {
				int sum = 0;
				for (Integer integer : ints) {
					sum = sum + integer;
				}
				return sum / list.size();

			}

		};

		aggregate(ints, average);

	}

	public static void aggregate(List<Integer> list, Aggregator aggregator) {
		Integer sum = aggregator.aggregate(list);
		System.out.println(sum);
	}
}

interface Aggregator {
	public Integer aggregate(List<Integer> list);
}
