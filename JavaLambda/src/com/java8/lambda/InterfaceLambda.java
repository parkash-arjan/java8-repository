package com.java8.lambda;

public class InterfaceLambda {

	public static void main(String[] args) {

		addString((s1, s2) -> s1 + s2);
	}

	public static void addString(StringAdder stringAdder) {
		String result = stringAdder.add("Hello ", " World");
		System.out.println(result);

	}
}

interface StringAdder {
	public String add(String s1, String s2);
}
