package com.java8.functional.interfaces.inheritance;

public class ParentChild_V1 {

	public static void main(String[] args) {

		Parent parentFoo = () -> System.out.println("Hi , I am Lambda::Parent");
		parentFoo.foo();

		Child childFoo = () -> System.out.println("Hi , I am Lambda::Child");
		childFoo.foo();

		// Error because NonFunctionalChild contains two method
		// If remove bar() from NonFunctionalChild then it will compile and work
		// NonFunctionalChild ref = () -> System.out.println("Hi , NonFunctionalChild");

	}
}
