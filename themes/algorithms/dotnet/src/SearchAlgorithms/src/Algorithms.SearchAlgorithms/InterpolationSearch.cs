namespace Algorithms.SearchAlgorithms;

public class InterpolationSearch
{
    public static int RecursiveInterpolationSearch(int[] arr, int lo, int hi, int x)
    {
        int pos;

        if (lo <= hi && x >= arr[lo] && x <= arr[hi])
        {
            pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]));

            if (arr[pos] == x)
                return pos;

            if (arr[pos] < x)
                return RecursiveInterpolationSearch(arr, pos + 1, hi, x);

            if (arr[pos] > x)
                return RecursiveInterpolationSearch(arr, lo, pos - 1, x);
        }

        return -1;
    }

    /// <summary>
    /// interpolationSearch - based on the principle of searching in the phone book or, for example, in a dictionary. 
    /// Instead of comparing each element with the target, as in a linear search, this algorithm performs a prediction
    /// of the location of the element: the search is similar to a binary search, but instead of dividing the search
    /// area into two parts, the interpolating search evaluates the new search area by the distance between the key
    /// and the current value of the element. In other words, binary search takes into account only the sign of the
    /// difference between the key and the current value, while the interpolating one also takes into account the
    /// modulus of this difference and, using this value, predicts the position of the next element to check.
    /// On average, interpolating search performs log(log(N)) operations, where N is the number of elements to search.
    /// </summary>
    ///
    /// <param name="arr">
    /// sorted array of integers
    /// </param>
    /// <param name="value">
    /// searching integer value
    /// </param>
    /// <returns>
    /// value position in array if found, else -1
    /// </returns>
    public static int DefaultInterpolationSearch(int[] array, int value)
    {
        int low = 0;
        int mid;
        int high = array.Length - 1;

        while (array[low] < value && array[high] > value)
        {
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
}
