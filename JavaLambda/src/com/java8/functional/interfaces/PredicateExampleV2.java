package com.java8.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExampleV2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 25, 14, 3, 1, 7, 8, 14, 26, 57);

		Predicate<Integer> predicate1 = (a) -> a > 10;
		Predicate<Integer> predicate2 = (a) -> a < 40;

		System.out.println(predicate1.test(8));

		System.out.println(predicate2.test(8));

		System.out.println(predicate1.test(8) && predicate2.test(8));
		System.out.println("------------------------------------");
		foo(list, predicate1, predicate2);

	}

	public static void foo(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {

		for (Integer integer : list) {
			if (predicate1.test(integer) && predicate2.test(integer)) {
				System.out.println(integer);
			}
		}
	}

}
