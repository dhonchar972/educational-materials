global using Xunit;

using Microsoft.Extensions.Logging;

namespace ConsoleAppTests;

public class UnitTest
{
    private readonly ILogger _logger = LoggerFactory.Create(builder => builder.AddConsole()).CreateLogger<UnitTest>();
    [Fact]
    public void Test()
    {
        _logger.LogInformation("nice!");

    }
}