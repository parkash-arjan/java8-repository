package com.java8.lambda;

public class StringAdderLambda {

	public static void main(String[] args) {

		StringAdder1 stringAdder = (s1, s2) -> s1 + s2;
		addString(stringAdder);
	}

	public static void addString(StringAdder1 stringAdder) {
		String result = stringAdder.add("Hello ", " World!");
		System.out.println(result);

	}
}

interface StringAdder1 {
	public String add(String s1, String s2);
}