using Core.Models;
using Microsoft.EntityFrameworkCore;

namespace Core.Data;

public class Collections : DbContext
{
    public Collections(DbContextOptions<Collections> options) : base(options)
    {
    }

    public DbSet<WeatherForecast> WeatherForecasts { get; set; }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.AddWeatherConstraints();
    }
}