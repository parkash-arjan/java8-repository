package com.java8.lambda.functions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8.common.Person;

public class FilterLambdaConsumerV1 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Pk", 36), new Person("Dv", 36), new Person("An", 4), new Person("Sam", 2), new Person("Sami", 2));

		printByCriteria(list, person -> true, person -> System.out.println(person));
		// printAll(list); updated with lambda version

		// Sort by name
		Collections.sort(list, (person1, person2) -> person1.getName().toLowerCase().compareTo(person2.getName().toLowerCase()));

		printByCriteria(list, person -> true, person -> System.out.println(person));

		// Sort by age increasing order
		Collections.sort(list, (person1, person2) -> Integer.valueOf(person1.getAge()).compareTo(Integer.valueOf(person2.getAge())));
		printByCriteria(list, person -> true, person -> System.out.println(person));

		// Sort by age decreasing order
		Collections.sort(list, (person1, person2) -> {
			return Integer.valueOf(person2.getAge()).compareTo(Integer.valueOf(person1.getAge()));
		});
		printByCriteria(list, person -> true, person -> System.out.println(person));

		// print person with age less than 10
		printByCriteria(list, (person) -> person.getAge() < 10 ? true : false, person -> System.out.println(person));

		// print person with age greater than 10
		printByCriteria(list, (person) -> person.getAge() > 10 ? true : false, person -> System.out.println(person));

	}

	public static void printByCriteria(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {
		System.out.println("Persons:");
		for (Person person : list) {
			if (predicate.test(person)) {
				consumer.accept(person);

			}
		}

	}
}
