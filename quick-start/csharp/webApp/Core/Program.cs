using Core.Config;
using Serilog;

var builder = WebApplication.CreateBuilder(args);

builder.ConfigureServices(); //ServiceConfig.ConfigureServices(builder);

//var configuration = new ConfigurationBuilder().AddJsonFile("application.json").Build();
var logger = new LoggerConfiguration()
    .ReadFrom.Configuration(builder.Configuration)
    .Enrich.FromLogContext()
    .CreateLogger();

builder.Host.UseSerilog(logger);

var app = builder.Build();

app.ConfigureMiddleware(); //MiddlewareConfig.ConfigureMiddleware(app);

app.Run();