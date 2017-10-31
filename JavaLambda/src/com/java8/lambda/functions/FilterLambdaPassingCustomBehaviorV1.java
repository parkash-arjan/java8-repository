package com.java8.lambda.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.java8.common.IPassBehaviour;
import com.java8.common.Person;

public class FilterLambdaPassingCustomBehaviorV1 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("Pk", 36), new Person("Dv", 36), new Person("An", 4), new Person("Sam", 2), new Person("Sami", 2));

		// print person with age greater than 10
		IPassBehaviour<Person> behaviour = new IPassBehaviour<>() {
			@Override
			public void accept(Person person) {
				System.out.println(person);
			}
		};
		printByCriteria(list, (person) -> person.getAge() > 10 ? true : false, behaviour);

		// if age is less than 10 increment age by 5

		IPassBehaviour<Person> behaviour1 = new IPassBehaviour<>() {
			@Override
			public void accept(Person person) {
				person.setAge(person.getAge() + 5);
				System.out.println(person);
			}
		};
		printByCriteria(list, (person) -> person.getAge() < 10 ? true : false, behaviour1);

	}

	public static void printByCriteria(List<Person> list, Predicate<Person> predicate, IPassBehaviour<Person> consumer) {
		System.out.println("Persons:");
		for (Person person : list) {
			if (predicate.test(person)) {
				consumer.accept(person);

			}
		}

	}
}
