package com.sorting;

import java.util.Scanner;

class BubbleSort {

	// Bubble Sort method
	public static void bubbleSort(int[] marks) {

		int n = marks.length;
		boolean swapped;

		// Traverse the array multiple times
		for (int i = 0; i < n - 1; i++) {

			swapped = false;

			// Compare adjacent elements
			for (int j = 0; j < n - i - 1; j++) {
				if (marks[j] > marks[j + 1]) {

					// Swap
					int temp = marks[j];
					marks[j] = marks[j + 1];
					marks[j + 1] = temp;

					swapped = true;
				}
			}

			// If no swaps, array is already sorted
			if (!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input number of students
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();

		int[] marks = new int[n];

		// Input marks
		System.out.println("Enter student marks:");
		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}

		// Sort marks
		bubbleSort(marks);

		// Output sorted marks
		System.out.println("\nSorted Student Marks (Ascending Order):");
		for (int mark : marks) {
			System.out.print(mark + " ");
		}

		sc.close();
	}
}
