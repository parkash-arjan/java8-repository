package com.java8.lambda;

public class SumLambda {

	public static void main(String[] args) {
		Adder adder = (a, b) -> a + b;
		System.out.println(adder.add(10, 20));
	}
}

interface Adder {
	public int add(int a, int b);
}
