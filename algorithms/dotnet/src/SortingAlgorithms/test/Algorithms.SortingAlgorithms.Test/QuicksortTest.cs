using Xunit;

namespace Algorithms.SortingAlgorithms.Test;

public class QuickSortTest
{
    [Fact]
    public void Test()
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        QuickSort.Sort(arr, 0, arr.Length - 1);
        foreach (var i in arr)
            System.Console.Write(i + " ");
        Assert.Equal(new int[] { 1, 5, 7, 8, 9, 10 }, arr);
    }
}
