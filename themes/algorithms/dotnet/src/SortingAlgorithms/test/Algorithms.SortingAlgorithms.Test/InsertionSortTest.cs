using System;
using Xunit;

namespace Algorithms.SortingAlgorithms.Test;

public class InsertionSortTest
{
    [Fact]
    public void Test()
    {
        int[] arr = { 12, 11, 13, 5, 6 };
        InsertionSort.Sort(arr);
        foreach (var i in arr)
            Console.Write(i + " ");
        Assert.Equal(new int[] { 5, 6, 11, 12, 13 }, arr);
    }
}
