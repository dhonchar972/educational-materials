using Xunit;

namespace Algorithms.SearchAlgorithms.Test;

public class BinarySearchTest
{
    [Fact]
    public void Test()
    {
        int[] arr = { 2, 3, 4, 10, 40 };
        var x = 10;
        var r = BinarySearch.DefaultBinarySearch(arr, x);
        var r2 = BinarySearch.GenericBinarySearch(arr, x);
        Assert.Equal(3, r);
        Assert.Equal(3, r2);
    }
}
