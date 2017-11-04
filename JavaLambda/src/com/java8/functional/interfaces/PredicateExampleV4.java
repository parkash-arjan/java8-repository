package com.java8.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExampleV4 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 25, 14, 3, 1, 7, 8, 14, 26, 57);

		// MyPredicate<Integer> predicate1 = (a) -> a > 10;
		// MyPredicate<Integer> predicate2 = (a) -> a < 40;
		//
		// Predicate<Integer> predicate3 = predicate1.and(predicate2);
		// foo(list, predicate3);

		MyPredicate<Integer> predicate1 = new MyPredicate<Integer>() {

			@Override
			public boolean test(Integer value) {
				return value > 10;
			}

		};

		MyPredicate<Integer> predicate2 = new MyPredicate<Integer>() {

			@Override
			public boolean test(Integer value) {
				return value < 40;
			}

		};

	}

	public static void foo(List<Integer> list, Predicate<Integer> predicate) {

		for (Integer integer : list) {
			if (predicate.test(integer)) {
				System.out.println(integer);
			}
		}
	}

}

abstract class MyPredicate<T> {

	public abstract boolean test(T t);

	public MyPredicate<T> and(MyPredicate<T> t) {
		return null;
	}
}