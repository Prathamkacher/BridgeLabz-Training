package com.day1.systemtask;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class TaskRunner {

	public static Runnable task = () -> System.out.println("Task running in theread: " + Thread.currentThread().getName());
	
	public static Predicate<Integer> isEven = n -> n % 2 == 0;
	
	public static BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
	
	public static BiFunction<Integer, Integer, Integer> greater = (a, b) -> a > b ? a : b;
}
