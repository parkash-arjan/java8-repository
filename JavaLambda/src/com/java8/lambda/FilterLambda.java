package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterLambda {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person("Parkash", 36), new Person("Divya", 36), new Person("Anira", 4), new Person("Samarth", 2), new Person("Samantha", 2));
		System.out.println(list);

		IFilter listS = (listp) -> {
			List<Person> listTemp = new ArrayList<>();
			for (Person person : listp) {
				if (person.getName().startsWith("S")) {
					listTemp.add(person);
				}
			}
			return listTemp;
		};

		List<Person> listTemp = listS.filter(list);
		System.out.println(listTemp);
	}

}

interface IFilter {
	public List<Person> filter(List<Person> list);
}

class Person {
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}