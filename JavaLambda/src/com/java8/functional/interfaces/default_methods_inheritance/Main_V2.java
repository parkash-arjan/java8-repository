package com.java8.functional.interfaces.default_methods_inheritance;

//Error 
//public class Main implements Foo, Bar {
public class Main_V2 implements Foo, Bar {

	public static void main(String[] args) {
		Main_V2 main = new Main_V2();
		System.out.println(main.common());
	}

	@Override
	public int common() {
		System.out.println("Calling overridden implementation....");
		return 9999;
	}

	@Override
	public void foo() {
	}

	@Override
	public void bar() {
	}

}
