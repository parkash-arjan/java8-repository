package com.java8.lambda.method_reference;

interface Interface1 {
	public void m1();

}

class StaticClass {

	public static void method1() {
		System.out.println("StaticClass::Static");
		System.out.println("StaticClass::Method");
		System.out.println("StaticClass::reference");
	}
}

public class StaticMethodRef {

	public static void main(String[] args) {

		// lambda way
		Interface1 ref = () -> {
			System.out.println("Static");
			System.out.println("Method");
			System.out.println("reference");
		};

		ref.m1();

		// static method reference way
		Interface1 ref1 = StaticClass::method1;
		ref1.m1();

	}

}
