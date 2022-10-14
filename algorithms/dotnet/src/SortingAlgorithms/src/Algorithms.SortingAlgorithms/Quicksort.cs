namespace Algorithms.SortingAlgorithms;
public class QuickSort
{
    private static int Partition(int[] arr, int low, int high)
    {
        var pivot = arr[high];
        var i = low - 1;

        for (var j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                (arr[i], arr[j]) = (arr[j], arr[i]);
            }
        }

        (arr[i + 1], arr[high]) = (arr[high], arr[i + 1]);
        return i + 1;
    }
    public static void Sort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            var part = Partition(arr, low, high);
            Sort(arr, low, part - 1);
            Sort(arr, part + 1, high);
        }
    }
}
