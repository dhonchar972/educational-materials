using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Globalization;
using System.Linq;
using System.Reflection;
using System.Runtime.CompilerServices;
using System.Security;
using System.Security.Permissions;

[assembly: CompilationRelaxations(8)]
[assembly: RuntimeCompatibility(WrapNonExceptionThrows = true)]
[assembly: Debuggable(DebuggableAttribute.DebuggingModes.Default |
           DebuggableAttribute.DebuggingModes.IgnoreSymbolStoreSequencePoints |
           DebuggableAttribute.DebuggingModes.EnableEditAndContinue |
           DebuggableAttribute.DebuggingModes.DisableOptimizations)]
[assembly: SecurityPermission(SecurityAction.RequestMinimum, SkipVerification = true)]
[assembly: AssemblyVersion("0.0.0.0")]
[module: UnverifiableCode]
[module: System.Runtime.CompilerServices.RefSafetyRules(11)]

internal class Program
{
    [CompilerGenerated]
    private static class <>O
    {
        public static Action<CultureInfo> <0>__WriteLine;
    }


    [Serializable]
    [CompilerGenerated]
    private sealed class <>c
    {
        public static readonly <>c<>9 = new <> c();

        public static Func<CultureInfo, bool> <>9__0_0;

        internal bool <Main>b__0_0(CultureInfo culture)
        {
            return culture.NumberFormat.NumberDecimalSeparator == ",";
        }
    }

    private static void Main()
    {
        IEnumerable<CultureInfo> source = Enumerable.Where(CultureInfo.GetCultures(CultureTypes.AllCultures), 
            <> c.<> 9__0_0 ?? (<> c.<> 9__0_0 = new Func<CultureInfo, bool>(<> c.<> 9.< Main > b__0_0)));
            
        Enumerable.ToList(source).ForEach(<> O.< 0 > __WriteLine ?? (<> O.< 0 > __WriteLine = new Action<CultureInfo>(Console.WriteLine)));
    }
}

namespace Microsoft.CodeAnalysis
{
    [CompilerGenerated]
    [Embedded]
    internal sealed class EmbeddedAttribute : Attribute
    {
    }
}

namespace System.Runtime.CompilerServices
{
    [CompilerGenerated]
    [Microsoft.CodeAnalysis.Embedded]
    [AttributeUsage(AttributeTargets.Module, AllowMultiple = false, Inherited = false)]
    internal sealed class RefSafetyRulesAttribute : Attribute
    {
        public readonly int Version;

        public RefSafetyRulesAttribute(int P_0)
        {
            Version = P_0;
        }
    }
}
