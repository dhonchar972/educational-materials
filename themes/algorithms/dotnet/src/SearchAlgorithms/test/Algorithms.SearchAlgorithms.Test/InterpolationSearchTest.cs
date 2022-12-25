using Xunit;
using System;

namespace Algorithms.SearchAlgorithms.Test;

public class InterpolationSearchTest
{
    [Fact]
    public void Test()
    {
        int[] arr = new int[] { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };

        int x = 18;
        int n = arr.Length;
        int index = InterpolationSearch.RecursiveInterpolationSearch(arr, 0, n - 1, x);
        int index2 = InterpolationSearch.DefaultInterpolationSearch(arr, x);
        Assert.Equal(4, index);
        Assert.Equal(4, index2);

        if (index != -1)
            Console.WriteLine("Element found at index {0}", index);
        else
            Console.WriteLine("Element not found.");
    }
}