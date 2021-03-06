package com.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.common.IFilterCriteria;
import com.java8.common.Person;

public class FilterLambda2 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Pk", 36), new Person("Dv", 36), new Person("An", 4), new Person("Sam", 2), new Person("Sami", 2));
		printAll(list);

		// We are using non-lambda approach first . Check FilterLambda3 for
		// lambda version of the same implementation.

		// Sort by name
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person person1, Person person2) {
				return person1.getName().toLowerCase().compareTo(person2.getName().toLowerCase());
			}
		});
		printAll(list);

		// Sort by age
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person person1, Person person2) {
				return Integer.valueOf(person1.getAge()).compareTo(Integer.valueOf(person2.getAge()));
			}
		});
		printAll(list); //

		// print person with age less than 10
		IFilterCriteria filterCriteriaLessThan10 = new IFilterCriteria() {
			@Override
			public boolean isPassed(Person person) {
				if (person.getAge() < 10) {
					return true;
				}
				return false;
			}
		};
		printByCriteria(list, filterCriteriaLessThan10);

		// print person with age greater than 10
		IFilterCriteria filterCriteriaGreaterThan10 = new IFilterCriteria() {
			@Override
			public boolean isPassed(Person person) {
				if (person.getAge() > 10) {
					return true;
				}
				return false;
			}
		};
		printByCriteria(list, filterCriteriaGreaterThan10);

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
