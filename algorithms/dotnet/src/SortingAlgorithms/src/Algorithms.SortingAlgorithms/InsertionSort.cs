using System.Collections;

namespace Algorithms.SortingAlgorithms;

public static class InsertionSort
{
    public static void Sort(IList<int> arr)
    {
        for (int i = 0; i < arr.Count - 1; i++)
            for (int j = i + 1; j > 0; j--)
                if (arr[j - 1] > arr[j])
                    (arr[j - 1], arr[j]) = (arr[j], arr[j - 1]);
    }
}
