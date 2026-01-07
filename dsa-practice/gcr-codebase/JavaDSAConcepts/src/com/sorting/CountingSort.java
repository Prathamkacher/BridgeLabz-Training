package com.sorting;

import java.util.Scanner;

public class CountingSort {

	// Counting Sort method for ages 10–18
	public static void countingSort(int[] ages) {

		int minAge = 10;
		int maxAge = 18;

		int range = maxAge - minAge + 1;
		int[] count = new int[range];
		int[] output = new int[ages.length];

		// Step 1: Count frequency of each age
		for (int age : ages) {
			count[age - minAge]++;
		}

		// Step 2: Cumulative frequency
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		// Step 3: Build output array (stable sort)
		for (int i = ages.length - 1; i >= 0; i--) {
			int age = ages[i];
			int position = count[age - minAge] - 1;
			output[position] = age;
			count[age - minAge]--;
		}

		// Step 4: Copy output back to original array
		for (int i = 0; i < ages.length; i++) {
			ages[i] = output[i];
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input number of students
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();

		int[] ages = new int[n];

		// Input ages
		System.out.println("Enter student ages (10 to 18):");
		for (int i = 0; i < n; i++) {
			ages[i] = sc.nextInt();
		}

		// Sort ages using Counting Sort
		countingSort(ages);

		// Output sorted ages
		System.out.println("\nSorted Student Ages (Ascending Order):");
		for (int age : ages) {
			System.out.print(age + " ");
		}

		sc.close();
	}
}
