package com.day8.gamezone;

public class GameZone {

    public static void quickSort(Player[] arr, int low, int high) {

        if (low < high) {
            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(Player[] arr, int low, int high) {

        Player pivot = arr[high];   // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // Descending order (higher score first)
            if (arr[j].score > pivot.score) {
                i++;

                // swap
                Player temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        Player temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
