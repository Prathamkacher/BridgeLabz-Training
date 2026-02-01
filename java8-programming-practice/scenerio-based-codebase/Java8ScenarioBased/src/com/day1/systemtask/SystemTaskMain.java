package com.day1.systemtask;
import java.util.Arrays;
import java.util.List;

public class SystemTaskMain {

	public static void main(String[] args) {
		
		Thread t = new Thread(TaskRunner.task);
		t.start();
		
		System.out.println("------ Numbers ------");
		List<Integer> list = Arrays.asList(5, 10, 15, 20, 25, 35, 40);
		list.forEach(System.out::println);
		
		
		int num = 16;
		
		System.out.println("\n" + num + " is even? " + TaskRunner.isEven.test(num));
		
		System.out.println("\nSum = " + TaskRunner.add.apply(10, 20));
		
		System.out.println("\nGreater = " + TaskRunner.greater.apply(20, 10));
	}
}
