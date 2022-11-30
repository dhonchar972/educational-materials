namespace CSTests.Honchar.Refs
{
    internal class RefClass
    {
        internal static void Change(IList<int> coll)
        {
            for (var i = 0; i < coll.Count; i++)
            {
                coll[i]++;
            }
        }

        internal static void Update(IList<int> coll)
        {
            coll = new List<int>() { 7, 12, 3, 34, 23, 5 };
        }

        internal static void UpdateByRef(ref IList<int> coll)
        {
            coll = new List<int>() { 7, 12, 3, 34, 23, 5 };
        }

        internal static void UpdateVal(ref int val)
        {
            val = 4;
        }

        internal static void UpdateString(ref string str)
        {
            str = "Updated string";
        }

        internal static void Increase(ref IList<int> list)
        {
            for (var i = 0; i < list.Count; i++) 
            {
                list[i]++;
            }
        }

        internal static void IncreaseTwo(ref List<int> list)
        {
            list.AsParallel().Select(v => ++v).ToList();
        }
    }
}
