package com.java8.lambda;

public class RunnableLambda {

	public static void main(String[] args) {
		// Thread thread = new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		// System.out.println("Hello World");
		//
		// }
		// });
		// thread.start();

		// Thread thread = new Thread(() -> System.out.println("Hello Runnable
		// Lambda"));
		// thread.start();

		new Thread(() -> System.out.println("Hello Runnable Lambda")).start();

	}
}
