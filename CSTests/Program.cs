using CSTests.Honchar.Refs;

namespace CSTests
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var l = new List<int>(){1, 2, 3, 4, 5, 6, 7};
            // RefClass.IncreaseTwo(ref l);
            l.AsParallel().Select(v => ++v).ToList();
            l.ForEach(Console.WriteLine);
        }
    }
}
