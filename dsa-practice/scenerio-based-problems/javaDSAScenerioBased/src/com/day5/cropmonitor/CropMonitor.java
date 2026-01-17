package com.day5.cropmonitor;

public class CropMonitor {

    public static void quickSort(SensorData[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(SensorData[] arr, int low, int high) {

        SensorData pivot = arr[high];  // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].minutes < pivot.minutes) {
                i++;

                // swap
                SensorData temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        SensorData temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
