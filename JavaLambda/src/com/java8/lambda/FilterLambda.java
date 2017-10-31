package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.java8.common.Person;

public class FilterLambda {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person("Pk", 36), new Person("Dv", 36), new Person("An", 4), new Person("Sam", 2), new Person("Sami", 2));
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
