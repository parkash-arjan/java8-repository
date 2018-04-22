package com.java8.functional.interfaces.anonymous_class;

public class MainFinalVariableTest {

	private int x = 2379;

	public static void main(String[] args) {
		MainFinalVariableTest main = new MainFinalVariableTest();
		main.bar();

	}

	public void bar() {
		// Method local values used inside lambda are effectively final
		// Better to implicitly qualify them as final
		int x = 9999;
		final int y = 8888;
		Foo foo = () -> {
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(y);
		};
		// this will cause compile time error online 19;
		// x = 500;
		foo.foo();
	}

}
