package org.search_algorithms.interpolation_search;

import java.util.List;
import java.util.Objects;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/1/2022
 */
public class InterpolationSearch {
    /**
     * interpolationSearch - based on the principle of searching in the phone book or, for example, in a dictionary.
     * Instead of comparing each element with the target, as in a linear search, this algorithm performs a prediction
     * of the location of the element: the search is similar to a binary search, but instead of dividing the search
     * area into two parts, the interpolating search evaluates the new search area by the distance between the key
     * and the current value of the element. In other words, binary search takes into account only the sign of the
     * difference between the key and the current value, while the interpolating one also takes into account the
     * modulus of this difference and, using this value, predicts the position of the next element to check.
     * On average, interpolating search performs log(log(N)) operations, where N is the number of elements to search.
     *
     * @param array sorted array of integers
     * @param value searching integer value
     * @return value position in array if found, else -1
     **/
    static int interpolationSearch(int[] array, int value) {
        int low = 0;
        int mid;
        int high = array.length - 1;

        while (array[low] < value && array[high] > value) {
            if (array[high] == array[low])
                break;

            mid = low + ((value - array[low]) * (high - low)) / (array[high] - array[low]);

            if (array[mid] < value)
                low = mid + 1;
            else if (array[mid] > value)
                high = mid + 1;
            else
                return mid;
        }

        if (array[low] == value)
            return low;
        if (array[high] == value)
            return high;

        return -1;
    }

    static <T extends Comparable<T>> int genericInterpolationSearch(T[] arr, T key) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while ((arr[high] != arr[low]) && (key.compareTo(arr[low]) >= 0) && (arr[high].compareTo(key) >= 0)) {
            // crutch, does not work humanly, only with this crooked wrapper
            mid = low + (((Integer) key - (Integer) arr[low]) * (high - low)
                    / ((Integer) arr[high] - (Integer) arr[low]));

            if (arr[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else if (arr[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        if (key == arr[low]) {
            return low;
        } else {
            return -1;
        }
    }

    static <T extends Number & Comparable<T>> int listInterpolationSearch(List<T> arr, T key) {
        int low = 0;
        int high = arr.size() - 1;
        int mid;

        // still crutches, does not work humanly
        while ((!Objects.equals(arr.get(high), arr.get(low)))
                && (key.intValue() >= arr.get(low).intValue())
                && (key.intValue() <= arr.get(high).intValue())) {
            mid = low + ((key.intValue() - arr.get(low).intValue()) * (high - low) / (arr.get(high).intValue()
                    - arr.get(low).intValue()));

            if (arr.get(mid).intValue() < key.intValue())
                low = mid + 1;
            else if (key.intValue() < arr.get(mid).intValue())
                high = mid - 1;
            else
                return mid;
        }

        if (Objects.equals(key, arr.get(low)))
            return low;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x = 18;
        int index = interpolationSearch(arr, x);
        Integer[] arr2 = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        var in = genericInterpolationSearch(arr2, x);
        var lis = List.of(10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47);
        var lisRes = listInterpolationSearch(lis, x);
        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }
}
