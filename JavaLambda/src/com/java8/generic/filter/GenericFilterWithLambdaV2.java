package com.java8.generic.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericFilterWithLambdaV2 {

	public static void main(String[] args) {

		// Test with list of strings
		List<String> strList = Arrays.asList("Java", "Scala", "C#", "Python", "JavScript", "C", "C++", "Assembly");
		List<String> strListResult = filter(strList, new Criteria<String>() {
			@Override
			public boolean isPassed(String criteria) {
				return criteria.startsWith("C") ? true : false;

			}
		});

		for (String string : strListResult) {
			System.out.println(string);
		}

		// Test with list of integers
		List<Integer> intList = Arrays.asList(10, 14, 2, 8, 25, 47, 95, 1, 7, 85);
		List<Integer> intListResult = filter(intList, new Criteria<Integer>() {
			@Override
			public boolean isPassed(Integer criteria) {
				return criteria > 25 ? true : false;

			}
		});

		for (Integer integer : intListResult) {
			System.out.println(integer);
		}

	}

	public static <T> List<T> filter(List<T> list, Criteria<T> criteria) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			if (criteria.isPassed(t)) {
				result.add(t);
			}
		}
		return result;
	}
}

interface Criteria<C> {
	public boolean isPassed(C criteria);
}
