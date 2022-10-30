using Core.Data;
using Core.Entities;
using Microsoft.EntityFrameworkCore;
using Microsoft.VisualBasic;

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

        builder.Services.AddDbContext<Collections>(options =>
        {
            options.UseNpgsql(builder.Configuration.GetConnectionString("Postgres"));
        });
    }
}
