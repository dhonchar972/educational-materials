namespace Algorithms.SearchAlgorithms;

public class LinearSearch
{
    public static int Search(int[] arr, int x)
    {
        for (int i = 0; i < arr.Length; i++)
        {
            if (arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }

    public static int RecursiveSearch(int[] arr, int size, int key)
    {
        if (size == 0)
        {
            return -1;
        }
        else if (arr[size - 1] == key)
        {
            return size - 1;
        }
        else
        {
            return RecursiveSearch(arr, size - 1, key);
        }
    }
}