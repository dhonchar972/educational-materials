var client = new HttpClient();

var res = Util.DownloadStringWithTimeout(client, "https://learn.microsoft.com/en-us/docs/"); // Task<string>
var res2 = await Util.DownloadStringWithTimeout(client, "https://learn.microsoft.com/en-us/docs/"); // string

if (res.Result == null)
    Console.WriteLine("Error");
else
    Console.WriteLine(res.Result);

Console.WriteLine(res2 == null ? "Error" : res2);

try
{
    var res3 = await Util.DownloadStringWithTimeout(client, "https://learn.microsoft.com/en-us/docs/");
    Console.WriteLine(res3);
}
catch (HttpRequestException hre)
{
    Console.WriteLine($"Error: {hre.Message}\n\n");
}

var res4 = await Util.DownloadStringWithTimeoutAndHeader(client, "https://learn.microsoft.com/en-us/docs/");
Console.WriteLine(res4);

//var res5 = await Util.DownloadString(client, "https://stackoverflow.com");
var res5 = await Util.DownloadString(client, "https://learn.microsoft.com/en-us/docs/");
Console.WriteLine($"Try: \n\n{res5}");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// var asy = await client.GetAsync("https://stackoverflow.com");
// var res = await asy.Content.ReadAsStringAsync();
// Console.WriteLine(res);

var test1 = await Util.DownloadString(client, "https://learn.microsoft.com/en-us/docs/");
var test2 = await Util.DownloadStringAsString(client, "https://learn.microsoft.com/en-us/docs/");

//var path = Directory.GetCurrentDirectory();

// var location = System.Reflection.Assembly.GetExecutingAssembly().Location;
// var path = System.IO.Path.GetDirectoryName(location);

var version = Environment.Version.ToString().Substring(0, 3);
var path = AppContext.BaseDirectory.Replace($"\\bin\\Debug\\net{version}", "");

await File.WriteAllTextAsync($"{path}\\Normal.html", test1);
await File.WriteAllTextAsync($"{path}\\AsString.html", test2);

var first = await File.ReadAllLinesAsync($"{path}\\Normal.html");
var second = await File.ReadAllLinesAsync($"{path}\\AsString.html");
var arr = new List<string>();
var trueCount = 0;
var falseCount = 0;
for (var i = 0; i < first.Length; i++)
    if (first[i] != second[i])
    {
        arr.Add(
            $"{i}:\nString from DownloadString: {first[i]}\nString from DownloadStringAsString: {second[i]}\n\n\n\n");
        falseCount++;
    }
    else
    {
        trueCount++;
    }

foreach (var i in arr)
{
    await File.WriteAllTextAsync($"{path}\\Final.html", i);
}

Console.WriteLine($"{trueCount}, {falseCount}");
//arr.ForEach(Console.WriteLine);

// var configuration = new ConfigurationBuilder()
//     .SetBasePath(AppContext.BaseDirectory)
//     .AddJsonFile("appsettings.json", optional: false).Build();
// var con = configuration.GetConnectionString("Default");

// var logger = LoggerFactory.CreateLogger("Name");