package org.sorting_algorithms.insertion_sort;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/1/2022
 */
public class InsertionSort {
    public static void sort(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++)
            for (int j = i + 1; j > 0; j--)
                if (inputArray[j - 1] > inputArray[j]) {
                    int temp = inputArray[j - 1];
                    inputArray[j - 1] = inputArray[j];
                    inputArray[j] = temp;
                }
    }
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        sort(arr);
        for (int i: arr)
            System.out.println(i + " ");
    }
}
