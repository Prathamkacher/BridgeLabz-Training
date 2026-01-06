package com.sorting;

import java.util.Scanner;

public class MergeSort {

	// Merge Sort method
	public static void mergeSort(int[] arr, int left, int right) {

		if (left < right) {

			int mid = left + (right - left) / 2;

			// Sort left half
			mergeSort(arr, left, mid);

			// Sort right half
			mergeSort(arr, mid + 1, right);

			// Merge sorted halves
			merge(arr, left, mid, right);
		}
	}

	// Merge two sorted subarrays
	private static void merge(int[] arr, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];

		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0, k = left;

		// Merge the temp arrays
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}

		// Copy remaining elements
		while (i < n1)
			arr[k++] = L[i++];

		while (j < n2)
			arr[k++] = R[j++];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input number of books
		System.out.print("Enter number of books: ");
		int n = sc.nextInt();

		int[] prices = new int[n];

		// Input book prices
		System.out.println("Enter book prices:");
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}

		// Sort prices using Merge Sort
		mergeSort(prices, 0, n - 1);

		// Output sorted prices
		System.out.println("\nSorted Book Prices (Ascending Order):");
		for (int price : prices) {
			System.out.print(price + " ");
		}

		sc.close();
	}
}
