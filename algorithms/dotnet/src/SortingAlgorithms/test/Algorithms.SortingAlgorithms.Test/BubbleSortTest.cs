using System.Collections.Generic;
using Xunit;

namespace Algorithms.SortingAlgorithms.Test;

public class BubbleSortTest
{
    [Fact]
    public void Test()
    {
        var arr = new List<int> { 78, 55, 45, 98, 13 };
        BubbleSort.Sort(arr);
        Assert.Equal(new List<int> { 13, 45, 55, 78, 98 }, arr);
    }
}
