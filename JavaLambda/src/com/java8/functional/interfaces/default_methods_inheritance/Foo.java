package com.java8.functional.interfaces.default_methods_inheritance;

@FunctionalInterface
public interface Foo {
	public void foo();

	public default int common() {
		System.out.println("Foo.common()");
		return 7777;
	}

}
