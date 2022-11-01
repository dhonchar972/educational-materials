using Microsoft.Extensions.Logging;

using static Serilog.ConsoleLoggerConfigurationExtensions;

namespace ConsoleApp
{
    class Program
    {
        public static void Main(string[] args)
        {
             ILogger logger = LoggerFactory
                 .Create(builder => builder.SetMinimumLevel(LogLevel.Debug).AddConsole())
                 .CreateLogger<Program>();

            logger.LogInformation("Message from default logger");

            Serilog.Log.Logger = new Serilog.LoggerConfiguration()
                .MinimumLevel.Debug()
                .WriteTo.Console()
                .CreateLogger();

            Serilog.Log.Logger.Information("Message from serilog");
        }
    }
}