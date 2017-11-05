package com.java8.functional.interfaces;

import java.util.Arrays;
import java.util.List;

public class PredicateExampleV6 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 25, 14, 3, 1, 7, 8, 14, 26, 57);

		APredicateV2 predicate1 = (i) -> i > 10;
		APredicateV2 predicate2 = (i) -> i < 40;

		APredicateV2 predicate3 = predicate1.and(predicate2);
		System.out.println(predicate3.test(15));

		foo(list, predicate3);

	}

	public static void foo(List<Integer> list, APredicateV2 predicate) {

		for (Integer integer : list) {
			if (predicate.test(integer)) {
				System.out.println(integer);
			}
		}
	}

}

interface APredicateV2 {
	public boolean test(Integer i);

	default public APredicateV2 and(APredicateV2 p) {
		APredicateV2 caller = (APredicateV2) this;
		return new APredicateV2() {
			@Override
			public boolean test(Integer i) {
				return caller.test(i) && p.test(i);
			}
		};
	}
}