package org.sorting_algorithms.bubble_sort;

import java.util.Arrays;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/1/2022
 */
public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void recursiveBubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        recursiveBubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.printf("Sorted array: %s\n", Arrays.toString(arr));

        //recursive call
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        recursiveBubbleSort(arr2, arr2.length);
        System.out.printf("Sorted array: %s\n", Arrays.toString(arr2));
    }
}
