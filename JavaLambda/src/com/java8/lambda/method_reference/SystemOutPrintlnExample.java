package com.java8.lambda.method_reference;

import static java.lang.System.out;

public class SystemOutPrintlnExample {

	public static void main(String[] args) {
		new Thread(out::println).start();
	}
}
