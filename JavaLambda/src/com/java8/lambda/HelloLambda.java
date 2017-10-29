package com.java8.lambda;

public class HelloLambda {

	public static void main(String[] args) {
		Greeter greeter = () -> System.out.println("Hello");
		greeter.greet();
	}

}

interface Greeter {
	public void greet();
}
