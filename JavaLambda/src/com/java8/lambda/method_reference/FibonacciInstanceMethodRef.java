package com.java8.lambda.method_reference;

public class FibonacciInstanceMethodRef {

	public static void main(String[] args) {

		// Fibonacci fibonacci = new Fibonacci(10);
		// Runnable runnable = fibonacci::get;
		// Thread thread = new Thread(runnable);
		// thread.start();

		Fibonacci fibonacci = new Fibonacci(10);
		new Thread(fibonacci::get).start();

	}
}
