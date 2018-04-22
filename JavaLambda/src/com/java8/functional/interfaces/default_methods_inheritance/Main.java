package com.java8.functional.interfaces.default_methods_inheritance;

//Error 
//public class Main implements Foo, Bar {
public class Main implements Foo, Bar {

	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.common());
	}

	@Override
	public int common() {
		return Foo.super.common();
		// return Bar.super.common();
	}

	@Override
	public void foo() {
	}

	@Override
	public void bar() {
	}

}
