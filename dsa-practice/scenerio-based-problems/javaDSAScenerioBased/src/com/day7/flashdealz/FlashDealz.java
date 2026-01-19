package com.day7.flashdealz;

public class FlashDealz {

    public static void quickSort(Product[] arr, int low, int high) {

        if (low < high) {
            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(Product[] arr, int low, int high) {

        Product pivot = arr[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // Descending order (higher discount first)
            if (arr[j].discount > pivot.discount) {
                i++;

                // swap
                Product temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        Product temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

