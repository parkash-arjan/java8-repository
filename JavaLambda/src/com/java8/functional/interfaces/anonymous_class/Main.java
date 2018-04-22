package com.java8.functional.interfaces.anonymous_class;

public class Main {

	private String string = "I am global string!";

	public static void main(String[] args) {
		Main main = new Main();
		// main.bar();
		main.bar_anonymous_class();
	}

	public void bar() {

		Foo foo = () -> {
			String string = "I am method Lambda local string!";
			System.out.println(string);
			System.out.println(this.string);
		};

		foo.foo();
	}

	public void bar_anonymous_class() {
		final String string = "I am method local string!";
		Foo foo = new Foo() {
			String string = "I am anonymous class global  string!";

			@Override
			public void foo() {
				String string = "I am anonymous class method local  string!";
				System.out.println(string);
				System.out.println(this.string);
			}
		};

		foo.foo();

	}

}
