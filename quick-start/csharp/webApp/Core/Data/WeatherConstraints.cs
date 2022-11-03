using Core.Models;
using Microsoft.EntityFrameworkCore;

namespace Core.Data;

public static class WeatherConstraints
{
    public static void AddWeatherConstraints(this ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<WeatherForecast>()
                    .HasKey(nameof(WeatherForecast.Id));
        // modelBuilder.Entity<WeatherForecast>()
        //          .HasKey(o => o.Id);
    }
}