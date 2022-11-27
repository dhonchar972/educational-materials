using static CSTests.Honchar.Refs.RefClass;

namespace CSTests.Honchar.Refs
{
    internal static class RefTest
    {
        internal static void Test()
        {
            var arr = new int[] { 12, 343, 343, 454, 545, 343, 34, 23 };
            Change(arr);
            Array.ForEach(arr, Console.WriteLine);

            var lis = new List<int>() { 12, 343, 343, 454, 545, 343, 34, 23 };
            Change(lis);
            lis.ForEach(Console.WriteLine);

            IList<int> lisUp = new List<int>() { 12, 343, 343, 454, 545, 343, 34, 23 };
            Update(lisUp);
            foreach (int i in lisUp)
            {
                Console.WriteLine(i); // 12, 343, 343, 454, 545, 343, 34, 23
            }
            UpdateByRef(ref lisUp);
            foreach (int i in lisUp)
            {
                Console.WriteLine(i); // 7, 12, 3, 34, 23, 5
            }

            var arrs = new int[] { 12, 343, 343, 454, 545, 343, 34, 23 };
            UpdateVal(ref arrs[0]);
            Console.WriteLine(arrs[0]);

            var strings = new string[] { "first", "second" };
            UpdateString(ref strings[0]);
            Console.WriteLine(strings[0]);
        }

    }
}
