package com.java8.lambda;

public class InterfaceLambda2 {

	public static void main(String[] args) {

		// addString((s1, s2) -> s1 + s2); ->error
	}

	public static void addString(StringAdderOne stringAdderOne) {
		String result = stringAdderOne.add("Hello ", " World-AdderOne");
		System.out.println(result);
	}

	public static void addString(StringMergerOne stringMergerOne) {
		String result = stringMergerOne.merger("Hello ", " World-MergerOne");
		System.out.println(result);
	}
}

interface StringAdderOne {
	public String add(String s1, String s2);
}

interface StringMergerOne {
	public String merger(String s1, String s2);
}