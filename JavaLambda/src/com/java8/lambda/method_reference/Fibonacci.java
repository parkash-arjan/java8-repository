package com.java8.lambda.method_reference;

public class Fibonacci {

	private int num;

	public Fibonacci(int num) {
		this.num = num;
	}

	public void get() {
		System.out.println(calculate(num));
	}

	private int calculate(int num) {
		if (num < 2) {
			return num;
		} else {
			return calculate(num - 1) + calculate(num - 2);
		}
	}

}
