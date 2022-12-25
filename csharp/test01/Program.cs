namespace CSTests
{
    /// <summary>
    /// Custom delegate Func.
    /// </summary>
    /// <typeparam name="T">Input type, declared as contravariant(in)</typeparam>
    /// <typeparam name="TResult">Output type, declared as covariant(out)</typeparam>
    public delegate TResult MyFunc<in T, out TResult>(T arg);
    public static class Program
    {
        public static IEnumerable<TSource> MyWhere<TSource>(this IEnumerable<TSource> source, Func<TSource, bool> predicate)
        {
            switch (source)
            {
                case Enumerable.Iterator<TSource> iterator:
                    return iterator.Where(predicate);
                case TSource[] source1:
                    return source1.Length != 0 ? (IEnumerable<TSource>) new Enumerable.WhereArrayIterator<TSource>(source1, predicate) : Enumerable.Empty<TSource>();
                case List<TSource> source2:
                    return (IEnumerable<TSource>) new Enumerable.WhereListIterator<TSource>(source2, predicate);
                default:
                    return (IEnumerable<TSource>) new Enumerable.WhereEnumerableIterator<TSource>(source, predicate);
            }
        }

        static void Main(string[] args)
        {
            var l = new List<int>() { 1, 2, 3, 4, 5, 6, 7 };
            var g = l.Where(v => v >= 4).ToList(); // public delegate TResult Func<in T, out TResult>(T arg)
            var c = (from v in l where v >= 4 select v).ToList();
            c.ForEach(Console.WriteLine);
        }
    }
}
