package com.java8.common;

@FunctionalInterface
public interface IFilterCriteria {
	public boolean isPassed(Person person);
}
