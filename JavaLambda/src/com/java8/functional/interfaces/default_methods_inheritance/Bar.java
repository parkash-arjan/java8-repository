package com.java8.functional.interfaces.default_methods_inheritance;

@FunctionalInterface
public interface Bar {
	public void bar();

	public default int common() {
		System.out.println("Bar.common()");
		return 8888;
	}

}
