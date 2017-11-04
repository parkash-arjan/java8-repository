package com.java8.functional.interfaces;

import java.util.Arrays;
import java.util.List;

public class PredicateExampleV5 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 25, 14, 3, 1, 7, 8, 14, 26, 57);

		APredicateV1 predicate1 = new APredicateV1() {

			@Override
			public boolean test(Integer value) {
				return value > 10;
			}

		};

		APredicateV1 predicate2 = new APredicateV1() {

			@Override
			public boolean test(Integer value) {
				return value < 40;
			}

		};

		APredicateV1 predicate3 = predicate1.and(predicate2);
		System.out.println(predicate3.test(15));

		foo(list, predicate3);

	}

	public static void foo(List<Integer> list, APredicateV1 predicate) {

		for (Integer integer : list) {
			if (predicate.test(integer)) {
				System.out.println(integer);
			}
		}
	}

}

abstract class APredicateV1 {
	public abstract boolean test(Integer i);

	public APredicateV1 and(APredicateV1 p) {
		APredicateV1 caller = (APredicateV1) this;
		return new APredicateV1() {
			@Override
			public boolean test(Integer i) {
				return caller.test(i) && p.test(i);
			}
		};
	}
}