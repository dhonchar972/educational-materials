using CSTests.Honchar.Test.First;
using CSTests.Honchar.Test.Second;

namespace CSTests.Honchar.Test
{
    sealed class TestTest : ITest // internal, also can be public
    {
        static readonly string _privateFinalString = "final string";
        public const int CONSTANT_INT = 14;
        public string StringProp { get; set; }
        public string InitProp { get; init; }
        public required string ReqProp { get; init; }

        private TestTest() { 
            TestFirst.DoSomethingFirst();
        }

        public TestTest(int i) { }

        protected TestTest(double d) { }

        public TestTest(string s) { }


        static void DoSomethingPrivate()
        {
            TestSecond.DoSomethingSecond();
        }

        internal void DoSomethingInternal()
        {
            TestSecond.DoSomethingSecond();
        }

        protected static void DoSomethingProtected()
        {
            TestSecond.DoSomethingSecond();
        }

        public static void DoSomethingPublic()
        {
            TestSecond.DoSomethingSecond();
        }

        public void DoWork(double d) => Console.WriteLine("impl");
    }
}
