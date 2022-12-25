namespace Algorithms.SortingAlgorithms;

public class BubbleSort
{
    public static void Sort(List<int> arr)
    {
        int temp;

        for (int j = 0; j <= arr.Count - 2; j++)
        {
            for (int i = 0; i <= arr.Count - 2; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
