package org.sorting_algorithms.quicksort;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/1/2022
 */
public class Quicksort {
    private static int partition(int[] arr, int low, int high) {
        var pivot = arr[high];
        var i = low - 1;

        for (var j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                var temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        var temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            var part = partition(arr, low, high);
            sort(arr, low, part - 1);
            sort(arr, part + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        sort(arr, 0, arr.length - 1);
        for (var i : arr)
            System.out.print(i + " ");
    }
}
