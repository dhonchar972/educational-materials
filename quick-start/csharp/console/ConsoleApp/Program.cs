using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;

using static Serilog.ConfigurationLoggerConfigurationExtensions;
using static Serilog.ConsoleLoggerConfigurationExtensions;
using static Serilog.Log;
using static Serilog.SerilogHostBuilderExtensions;

namespace ConsoleApp
{
    class Program
    {
        public static void Main(string[] args)
        {
            #region 
            // ILogger logger = LoggerFactory
            //     .Create(builder => builder.SetMinimumLevel(LogLevel.Debug).AddConsole())
            //     .CreateLogger<Program>();

            // logger.LogInformation("Message from default logger");
            #endregion

            #region 
            // Logger = new Serilog.LoggerConfiguration()
            //     .MinimumLevel.Debug()
            //     .WriteTo.Console()
            //     .CreateLogger();
            #endregion

            #region 
            // string rootDirectoryPath = AppDomain.CurrentDomain.BaseDirectory;
            // var loc = $"{rootDirectoryPath}..{Path.DirectorySeparatorChar}..{Path.DirectorySeparatorChar}..{Path.DirectorySeparatorChar}appsettings.json";
            // var conf = new ConfigurationBuilder().AddJsonFile(loc).Build();
            // Logger = new Serilog.LoggerConfiguration().ReadFrom.Configuration(conf).CreateLogger();
            #endregion

            #region 
            var host = AppStartup();
            var moq = ActivatorUtilities.CreateInstance<Moq>(host.Services);
            moq.DoSomething();
            #endregion 

            Logger.Information("HI!!!");
        }

        static void BuildConfig(IConfigurationBuilder builder)
        {
            builder.SetBasePath(Directory.GetCurrentDirectory())
                .AddJsonFile("appsettings.json", optional: false, reloadOnChange: true)
                .AddEnvironmentVariables();
        }

        static IHost AppStartup()
        {
            var builder = new ConfigurationBuilder();
            BuildConfig(builder);

            Logger = new Serilog.LoggerConfiguration()
                            .ReadFrom.Configuration(builder.Build())
                            .Enrich.FromLogContext()
                            .WriteTo.Console()
                            .CreateLogger();

            Logger.Information("Application Starting");

            var host = Host.CreateDefaultBuilder()
                        .ConfigureServices((context, services) =>
                        {
                            services.AddTransient<IMoq, Moq>();
                        })
                        .UseSerilog()
                        .Build();

            return host;
        }
    }
}