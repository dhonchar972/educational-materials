using Microsoft.Extensions.Logging;

namespace Algorithms.SearchAlgorithms;

public class BinarySearch
{
    private static ILogger _myLogger = LoggerFactory.Create(builder => builder.AddConsole()).CreateLogger<BinarySearch>();

    public static int DefaultBinarySearch(int[] arr, int key)
    {
        int left = 0;
        int right = arr.Length - 1;

        while (left <= right)
        {
            int middle = left + (right - left) / 2;

            if (arr[middle] == key)
            {
                _myLogger.LogInformation("Position: {0}", middle);
                return middle;
            }
            else if (arr[middle] < key)
            {
                left = middle + 1;
            }
            else
            {
                right = middle - 1;
            }
        }

        _myLogger.LogInformation("Not found!!");
        return -1;
    }

    public static int GenericBinarySearch<T>(IEnumerable<T> list, T key) where T : IComparable
    {
        int left = 0;
        int right = list.Count() - 1;

        while (left <= right)
        {
            int middle = (left + right) / 2;
            T item = list.ElementAt(middle);
            var comparison = key.CompareTo(item);

            if (comparison == 0)
            {
                return middle;
            }

            if (comparison < 0)
            {
                right = middle - 1;
            }
            else
            {
                left = middle + 1;
            }
        }

        return -1;
    }
}
