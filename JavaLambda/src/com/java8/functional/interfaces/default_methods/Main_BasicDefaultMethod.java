package com.java8.functional.interfaces.default_methods;

public class Main_BasicDefaultMethod {

	public static void main(String[] args) {
		BasicDefaultMethod basicDefaultMethod = new ChildBasicDefaultMethod();
		basicDefaultMethod.foo();
		int x = basicDefaultMethod.bar();
		System.out.println(x);

		ChildBasicDefaultMethod childBasicDefaultMethod = new ChildBasicDefaultMethod();
		childBasicDefaultMethod.foo();
		int y = childBasicDefaultMethod.bar();
		System.out.println(y);

		BasicDefaultMethod childBasicDefaultMethodOverride = new ChildBasicDefaultMethodOverride();
		childBasicDefaultMethodOverride.foo();
		int value = childBasicDefaultMethodOverride.bar();
		System.out.println(value);

	}
}
