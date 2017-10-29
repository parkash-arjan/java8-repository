package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.java8.common.Person;

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
