package com.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.java8.common.IFilterCriteria;
import com.java8.common.Person;

public class FilterLambda3 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Parkash", 36), new Person("Divya", 36), new Person("Anira", 4), new Person("Samarth", 2), new Person("Samantha", 2));
		printAll(list);

		// Sort by name
		Collections.sort(list, (person1, person2) -> person1.getName().toLowerCase().compareTo(person2.getName().toLowerCase()));

		printAll(list);

		// Sort by age
		Collections.sort(list, (person1, person2) -> Integer.valueOf(person1.getAge()).compareTo(Integer.valueOf(person2.getAge())));

		printAll(list);

		// print person with age less than 10
		printByCriteria(list, (person) -> person.getAge() < 10 ? true : false);

		// print person with age greater than 10
		printByCriteria(list, (person) -> person.getAge() > 10 ? true : false);

	}

	public static void printAll(List<Person> list) {
		System.out.println("Person List");
		for (Person person : list) {
			System.out.println(person);
		}
	}

	public static void printByCriteria(List<Person> list, IFilterCriteria filterCriteria) {
		System.out.println("Person List With Criteria");
		for (Person person : list) {
			if (filterCriteria.isPassed(person)) {
				System.out.println(person);
			}
		}

	}
}

