package org.search_algorithms.linear_search;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/1/2022
 */
public class LinearSearch {
    static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static int recursiveSearch(int[] arr, int size, int key) {
        if (size == 0) {
            return -1;
        } else if (arr[size - 1] == key) {
            return size - 1;
        } else {
            return recursiveSearch(arr, size - 1, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        var x = 10;
        var result = search(arr, x);
        var recurRes = recursiveSearch(arr, arr.length, x);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.printf("Element is present at index %d", result);
        }
    }
}
