using Microsoft.Extensions.Logging;

namespace ConsoleApp
{
    class Program
    {
        public static void Main(string[] args)
        {
            using var loggerFactory = LoggerFactory.Create(builder =>
            {
                builder
                    .AddFilter("Microsoft", LogLevel.Warning)
                    .AddFilter("System", LogLevel.Warning)
                    .AddFilter("LoggingConsoleApp.Program", LogLevel.Debug)
                    .AddConsole();
            });
            ILogger logger = loggerFactory.CreateLogger<Program>();
            logger.LogInformation("Example log message");

            ILogger myLogger = LoggerFactory.Create(builder => builder.AddConsole()).CreateLogger<Program>();
            myLogger.LogInformation("Example log message2");
        }
    }
}