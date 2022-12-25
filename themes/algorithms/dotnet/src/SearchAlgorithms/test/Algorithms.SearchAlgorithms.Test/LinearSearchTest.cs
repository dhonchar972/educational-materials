using Xunit;

namespace Algorithms.SearchAlgorithms.Test;

public class LinearSearchTest
{
    [Fact]
    public void Test()
    {
        int[] arr = { 2, 3, 4, 10, 40 };
        var x = 10;
        var result = LinearSearch.Search(arr, x);
        var recurRes = LinearSearch.RecursiveSearch(arr, arr.Length, x);
        Assert.Equal(3, result);
        Assert.Equal(3, recurRes);

        if (result == -1)
        {
            System.Console.WriteLine("Element is not present in array");
        }
        else
        {
            System.Console.WriteLine("Element is present at index {0}", result);
        }
    }
}
