package com.java8.generic.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class GenericFilterWithLambdaV2 {

	public static void main(String[] args) {

		// Test with list of strings
		List<String> strList = Arrays.asList("Java", "Scala", "C#", "Python", "JavScript", "C", "C++", "Assembly");

		filter(strList, (criteria) -> criteria.startsWith("C") ? true : false, (c) -> System.out.println(c));

		// Test with list of integers
		List<Integer> intList = Arrays.asList(10, 14, 2, 8, 25, 47, 95, 1, 7, 85);
		filter(intList, (criteria) -> criteria > 25 ? true : false, System.out::println);

	}

	public static <T> List<T> filter(List<T> list, FilterCriteria<T> criteria, Consumer<T> consumer) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			if (criteria.isPassed(t)) {
				result.add(t);
				consumer.accept(t);
			}
		}
		return result;
	}
}

interface FilterCriteria<C> {
	public boolean isPassed(C criteria);
}
