package org.search_algorithms.binary_search;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/1/2022
 */
public class BinarySearch {
    static int binarySearch(int[] collection, int key) {
        int left = 0;
        int right = collection.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (collection[middle] == key) {
                return middle;
            } else if (collection[middle] < key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static <T extends Number & Comparable<T>> int genericBinarySearch(T[] collection, T key) {
        int left = 0;
        int right = collection.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            var comparison = key.compareTo(collection[middle]);

            if (comparison == 0) {
                return middle;
            } else if (comparison < 0) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        var x = 10;
        var result = binarySearch(arr, x);

        Integer[] arr2 = {2, 3, 4, 10, 40};
        Integer x2 = 10;
        var result2 = genericBinarySearch(arr2, x2);

        if (result == -1 || result2 == -1) {
            System.out.println("Element not present");
        } else {
            System.out.printf("Element found at index %d and %d", result, result2);
        }
    }
}
