package com.java8.functional.interfaces.default_methods;

public class ChildBasicDefaultMethodOverride implements BasicDefaultMethod {

	@Override
	public void foo() {
		System.out.println("ChildBasicDefaultMethodOverride:foo()");

	}

	@Override
	public int bar() {
		System.out.println("ChildBasicDefaultMethodOverride:bar()");
		return 9999;
	}
}
