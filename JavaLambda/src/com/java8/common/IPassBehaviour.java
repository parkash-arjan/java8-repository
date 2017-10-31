package com.java8.common;

@FunctionalInterface
public interface IPassBehaviour<B> {
	public void accept(B b);
}