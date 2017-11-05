package com.java8.functional.interfaces;

import java.util.Arrays;
import java.util.List;

public class PredicateExampleV7 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 25, 14, 3, 1, 7, 8, 14, 26, 57);

		APredicateV3 predicate1 = (i) -> i > 10;
		APredicateV3 predicate2 = (i) -> i < 40;

		APredicateV3 predicate3 = predicate1.and(predicate2);
		System.out.println(predicate3.test(15));

		foo(list, predicate3);

	}

	public static void foo(List<Integer> list, APredicateV3 predicate) {

		for (Integer integer : list) {
			if (predicate.test(integer)) {
				System.out.println(integer);
			}
		}
	}

}

interface APredicateV3 {
	public boolean test(Integer i);

	default public APredicateV3 and(APredicateV3 p) {
		return (i) -> test(i) && p.test(i);
	}
}