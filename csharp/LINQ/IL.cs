.assembly _
{
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilationRelaxationsAttribute::.ctor(int32) = (
        01 00 08 00 00 00 00 00
    )
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.RuntimeCompatibilityAttribute::.ctor() = (
        01 00 01 00 54 02 16 57 72 61 70 4e 6f 6e 45 78
        63 65 70 74 69 6f 6e 54 68 72 6f 77 73 01
    )
    .custom instance void [System.Runtime]System.Diagnostics.DebuggableAttribute::.ctor(valuetype [System.Runtime]System.Diagnostics.DebuggableAttribute/DebuggingModes) = (
        01 00 07 01 00 00 00 00
    )
    .permissionset reqmin = (
        2e 01 80 8a 53 79 73 74 65 6d 2e 53 65 63 75 72
        69 74 79 2e 50 65 72 6d 69 73 73 69 6f 6e 73 2e
        53 65 63 75 72 69 74 79 50 65 72 6d 69 73 73 69
        6f 6e 41 74 74 72 69 62 75 74 65 2c 20 53 79 73
        74 65 6d 2e 52 75 6e 74 69 6d 65 2c 20 56 65 72
        73 69 6f 6e 3d 37 2e 30 2e 30 2e 30 2c 20 43 75
        6c 74 75 72 65 3d 6e 65 75 74 72 61 6c 2c 20 50
        75 62 6c 69 63 4b 65 79 54 6f 6b 65 6e 3d 62 30
        33 66 35 66 37 66 31 31 64 35 30 61 33 61 15 01
        54 02 10 53 6b 69 70 56 65 72 69 66 69 63 61 74
        69 6f 6e 01
    )
    .hash algorithm 0x00008004 // SHA1
    .ver 0:0:0:0
}

.class private auto ansi '<Module>'
{
} // end of class <Module>

.class private auto ansi beforefieldinit Program
    extends [System.Runtime]System.Object
{
    // Nested Types
    .class nested private auto ansi abstract sealed beforefieldinit '<>O'
        extends[System.Runtime]System.Object
    {
        .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = (
            01 00 00 00
        )
        // Fields
        .field public static class [System.Runtime]System.Action`1<class [System.Runtime]System.Globalization.CultureInfo > '<0>__WriteLine'

    } // end of class <>O

    .class nested private auto ansi sealed serializable beforefieldinit '<>c'
        extends[System.Runtime]System.Object
    {
        .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = (
            01 00 00 00
        )
        // Fields
        .field public static initonly class Program/'<>c' '<>9'
        .field public static class [System.Runtime]System.Func`2<class [System.Runtime]System.Globalization.CultureInfo, bool> '<>9__0_0'

        // Methods
        .method private hidebysig specialname rtspecialname static
            void .cctor() cil managed
        {
            // Method begins at RVA 0x20d5
            // Code size 11 (0xb)
            .maxstack 8

            IL_0000: newobj instance void Program/'<>c'::.ctor()
            IL_0005: stsfld class Program/'<>c' Program/'<>c'::'<>9'
            IL_000a: ret
        } // end of method '<>c'::.cctor

        .method public hidebysig specialname rtspecialname
            instance void .ctor() cil managed
        {
            // Method begins at RVA 0x20cc
            // Code size 8 (0x8)
            .maxstack 8

            IL_0000: ldarg.0
            IL_0001: call instance void [System.Runtime]System.Object::.ctor()
            IL_0006: nop
            IL_0007: ret
        } // end of method '<>c'::.ctor

        .method assembly hidebysig 
            instance bool '<Main>b__0_0' (
                class [System.Runtime]System.Globalization.CultureInfo culture
            ) cil managed
        {
            // Method begins at RVA 0x20e1
            // Code size 22 (0x16)
            .maxstack 8

            IL_0000: ldarg.1
            IL_0001: callvirt instance class [System.Runtime]System.Globalization.NumberFormatInfo [System.Runtime]System.Globalization.CultureInfo::get_NumberFormat()
            IL_0006: callvirt instance string [System.Runtime]System.Globalization.NumberFormatInfo::get_NumberDecimalSeparator()
            IL_000b: ldstr ","
            IL_0010: call bool [System.Runtime]System.String::op_Equality(string, string)
            IL_0015: ret
        } // end of method '<>c'::'<Main>b__0_0'

    } // end of class <>c


    // Methods
    .method private hidebysig static
        void Main() cil managed
    {
        // Method begins at RVA 0x206c
        // Code size 84 (0x54)
        .maxstack 3
        .locals init (
            [0] class [System.Runtime]System.Collections.Generic.IEnumerable`1<class [System.Runtime]System.Globalization.CultureInfo> commaCultures
        )

        IL_0000: nop
        IL_0001: ldc.i4.7
        IL_0002: call class [System.Runtime]System.Globalization.CultureInfo[] [System.Runtime]System.Globalization.CultureInfo::GetCultures(valuetype [System.Runtime]System.Globalization.CultureTypes)
        IL_0007: ldsfld class [System.Runtime]System.Func`2<class [System.Runtime]System.Globalization.CultureInfo, bool> Program/'<>c'::'<>9__0_0'
        IL_000c: dup
        IL_000d: brtrue.s IL_0026

        IL_000f: pop
        IL_0010: ldsfld class Program/'<>c' Program/'<>c'::'<>9'
        IL_0015: ldftn instance bool Program/'<>c'::'<Main>b__0_0'(class [System.Runtime]System.Globalization.CultureInfo)
        IL_001b: newobj instance void class [System.Runtime]System.Func`2<class [System.Runtime]System.Globalization.CultureInfo, bool>::.ctor(object, native int)
        IL_0020: dup
        IL_0021: stsfld class [System.Runtime]System.Func`2<class [System.Runtime]System.Globalization.CultureInfo, bool> Program/'<>c'::'<>9__0_0'

        IL_0026: call class [System.Runtime]System.Collections.Generic.IEnumerable`1<!!0> [System.Linq]System.Linq.Enumerable::Where<class [System.Runtime]System.Globalization.CultureInfo> (class [System.Runtime]System.Collections.Generic.IEnumerable`1<!!0>, class [System.Runtime]System.Func`2<!!0, bool>)
        IL_002b: stloc.0
        IL_002c: ldloc.0
        IL_002d: call class [System.Collections]System.Collections.Generic.List`1<!!0> [System.Linq]System.Linq.Enumerable::ToList<class [System.Runtime]System.Globalization.CultureInfo> (class [System.Runtime]System.Collections.Generic.IEnumerable`1<!!0>)
        IL_0032: ldsfld class [System.Runtime]System.Action`1<class [System.Runtime]System.Globalization.CultureInfo> Program/'<>O'::'<0>__WriteLine'
        IL_0037: dup
        IL_0038: brtrue.s IL_004d

        IL_003a: pop
        IL_003b: ldnull
        IL_003c: ldftn void [System.Console]System.Console::WriteLine(object)
        IL_0042: newobj instance void class [System.Runtime]System.Action`1<class [System.Runtime]System.Globalization.CultureInfo>::.ctor(object, native int)
        IL_0047: dup
        IL_0048: stsfld class [System.Runtime]System.Action`1<class [System.Runtime]System.Globalization.CultureInfo> Program/'<>O'::'<0>__WriteLine'

        IL_004d: callvirt instance void class [System.Collections]System.Collections.Generic.List`1<class [System.Runtime]System.Globalization.CultureInfo>::ForEach(class [System.Runtime]System.Action`1<!0>)
        IL_0052: nop
        IL_0053: ret
    } // end of method Program::Main

    .method public hidebysig specialname rtspecialname
        instance void .ctor() cil managed
    {
        // Method begins at RVA 0x20cc
        // Code size 8 (0x8)
        .maxstack 8

        IL_0000: ldarg.0
        IL_0001: call instance void [System.Runtime]System.Object::.ctor()
        IL_0006: nop
        IL_0007: ret
    } // end of method Program::.ctor

} // end of class Program

.class private auto ansi sealed beforefieldinit Microsoft.CodeAnalysis.EmbeddedAttribute
    extends [System.Runtime]System.Attribute
{
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = (
        01 00 00 00
    )
    .custom instance void Microsoft.CodeAnalysis.EmbeddedAttribute::.ctor() = (
        01 00 00 00
    )
    // Methods
    .method public hidebysig specialname rtspecialname
        instance void .ctor() cil managed
    {
        // Method begins at RVA 0x2050
        // Code size 8 (0x8)
        .maxstack 8

        IL_0000: ldarg.0
        IL_0001: call instance void [System.Runtime]System.Attribute::.ctor()
        IL_0006: nop
        IL_0007: ret
    } // end of method EmbeddedAttribute::.ctor

} // end of class Microsoft.CodeAnalysis.EmbeddedAttribute

.class private auto ansi sealed beforefieldinit System.Runtime.CompilerServices.RefSafetyRulesAttribute
    extends [System.Runtime]System.Attribute
{
    .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilerGeneratedAttribute::.ctor() = (
        01 00 00 00
    )
    .custom instance void Microsoft.CodeAnalysis.EmbeddedAttribute::.ctor() = (
        01 00 00 00
    )
    .custom instance void [System.Runtime]System.AttributeUsageAttribute::.ctor(valuetype [System.Runtime]System.AttributeTargets) = (
        01 00 02 00 00 00 02 00 54 02 0d 41 6c 6c 6f 77
        4d 75 6c 74 69 70 6c 65 00 54 02 09 49 6e 68 65
        72 69 74 65 64 00
    )
    // Fields
    .field public initonly int32 Version

    // Methods
    .method public hidebysig specialname rtspecialname
        instance void .ctor (
            int32 ''
        ) cil managed
    {
        // Method begins at RVA 0x2059
        // Code size 15 (0xf)
        .maxstack 8

        IL_0000: ldarg.0
        IL_0001: call instance void [System.Runtime]System.Attribute::.ctor()
        IL_0006: nop
        IL_0007: ldarg.0
        IL_0008: ldarg.1
        IL_0009: stfld int32 System.Runtime.CompilerServices.RefSafetyRulesAttribute::Version
        IL_000e: ret
    } // end of method RefSafetyRulesAttribute::.ctor

} // end of class System.Runtime.CompilerServices.RefSafetyRulesAttribute
