package com.sorting;

import java.util.Scanner;

public class QuickSort {

	// Quick Sort method
	public static void quickSort(int[] arr, int low, int high) {

		if (low < high) {

			// Partition index
			int pivotIndex = partition(arr, low, high);

			// Sort left subarray
			quickSort(arr, low, pivotIndex - 1);

			// Sort right subarray
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	// Partition method (pivot = last element)
	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;

				// Swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Place pivot at correct position
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input number of products
		System.out.print("Enter number of products: ");
		int n = sc.nextInt();

		int[] prices = new int[n];

		// Input product prices
		System.out.println("Enter product prices:");
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}

		// Sort prices using Quick Sort
		quickSort(prices, 0, n - 1);

		// Output sorted prices
		System.out.println("\nSorted Product Prices (Ascending Order):");
		for (int price : prices) {
			System.out.print(price + " ");
		}

		sc.close();
	}
}
