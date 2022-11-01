using Core.Data;
using Microsoft.EntityFrameworkCore;
using Serilog;

namespace Core.Config;

public static class ServiceConfig
{
    // public static void ConfigureServices(WebApplicationBuilder builder) // Add services to the container.
    // {
    //     builder.Services.AddControllers();
    //     builder.Services.AddEndpointsApiExplorer();
    //     builder.Services.AddSwaggerGen();
    // }

    public static void ConfigureServices(this WebApplicationBuilder builder) // Add services to the container.
    {
        builder.Services.AddControllers();
        builder.Services.AddEndpointsApiExplorer();
        builder.Services.AddSwaggerGen();

        //var configuration = new ConfigurationBuilder().AddJsonFile("application.json").Build();
        var logger = new LoggerConfiguration()
            .ReadFrom.Configuration(builder.Configuration)
            .Enrich.FromLogContext()
            .CreateLogger();

        builder.Host.UseSerilog(logger);

        builder.Services.AddDbContext<Collections>(options =>
        {
            options.UseNpgsql(builder.Configuration.GetConnectionString("Postgres"));
        });
    }
}
