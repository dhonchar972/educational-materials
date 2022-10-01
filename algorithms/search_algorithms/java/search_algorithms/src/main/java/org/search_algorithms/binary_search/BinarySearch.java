package org.search_algorithms.binary_search;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/1/2022
 */
public class BinarySearch {
    static int binarySearch(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x) {
                return m;
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        var x = 10;
        var result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        }
        else {
            System.out.printf("Element found at index %d", result);
        }
    }
}
