using Core.Entities;
using Microsoft.EntityFrameworkCore;

namespace Core.Data;

public class Collections : DbContext
{
    public Collections(DbContextOptions<Collections> options) : base(options)
    {

    }

    public DbSet<WeatherForecast> WeatherForecasts { get; set; }

}