using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;

class Program
{
    static void Main()
    {
        IEnumerable<CultureInfo> commaCultures = from culture in CultureInfo.GetCultures(CultureTypes.AllCultures)
                                                 where culture.NumberFormat.NumberDecimalSeparator == ","
                                                 select culture;

        commaCultures.ToList().ForEach(Console.WriteLine);

        IEnumerable<CultureInfo> commaCultures2 = CultureInfo.GetCultures(CultureTypes.AllCultures)
                                                    .Where(c => c.NumberFormat.NumberDecimalSeparator == ",");

        foreach (var c in commaCultures2)
        {
            Console.WriteLine(c);
        }
    }
}
