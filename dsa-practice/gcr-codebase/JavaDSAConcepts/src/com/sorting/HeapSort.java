package com.sorting;

import java.util.Scanner;

public class HeapSort {

	// Heap Sort method
	public static void heapSort(int[] arr) {

		int n = arr.length;

		// Step 1: Build Max Heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// Step 2: Extract elements one by one
		for (int i = n - 1; i > 0; i--) {

			// Move current root (largest) to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// Heapify the reduced heap
			heapify(arr, i, 0);
		}
	}

	// Heapify subtree rooted at index i
	private static void heapify(int[] arr, int heapSize, int i) {

		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		// If left child is larger
		if (left < heapSize && arr[left] > arr[largest]) {
			largest = left;
		}

		// If right child is larger
		if (right < heapSize && arr[right] > arr[largest]) {
			largest = right;
		}

		// If largest is not root
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify affected subtree
			heapify(arr, heapSize, largest);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input number of applicants
		System.out.print("Enter number of job applicants: ");
		int n = sc.nextInt();

		int[] salaries = new int[n];

		// Input salary demands
		System.out.println("Enter expected salary demands:");
		for (int i = 0; i < n; i++) {
			salaries[i] = sc.nextInt();
		}

		// Sort salaries using Heap Sort
		heapSort(salaries);

		// Output sorted salaries
		System.out.println("\nSorted Salary Demands (Ascending Order):");
		for (int salary : salaries) {
			System.out.print(salary + " ");
		}

		sc.close();
	}
}
