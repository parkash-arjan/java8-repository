package com.java8.functional.interfaces.default_methods;

@FunctionalInterface
public interface BasicDefaultMethod {
	public void foo();

	public default int bar() {
		System.out.println("Hi , I am default methods in bar()");
		return 2379;
	}

	// Error
	// A default method cannot override a method from java.lang.Object
	// public default String toString() {
	// return "";
	// }
}
