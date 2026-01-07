package com.sorting;

import java.util.Scanner;

class InsertionSort {

	// Insertion Sort method
	public static void insertionSort(int[] ids) {

		int n = ids.length;

		// Start from the second element
		for (int i = 1; i < n; i++) {

			int key = ids[i]; // element to be inserted
			int j = i - 1;

			// Shift elements greater than key to the right
			while (j >= 0 && ids[j] > key) {
				ids[j + 1] = ids[j];
				j--;
			}

			// Insert key at correct position
			ids[j + 1] = key;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input number of employees
		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();

		int[] employeeIds = new int[n];

		// Input employee IDs
		System.out.println("Enter employee IDs:");
		for (int i = 0; i < n; i++) {
			employeeIds[i] = sc.nextInt();
		}

		// Sort employee IDs
		insertionSort(employeeIds);

		// Output sorted IDs
		System.out.println("\nSorted Employee IDs (Ascending Order):");
		for (int id : employeeIds) {
			System.out.print(id + " ");
		}

		sc.close();
	}
}
