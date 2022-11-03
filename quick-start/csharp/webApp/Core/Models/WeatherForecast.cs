using System.ComponentModel.DataAnnotations;

namespace Core.Models;

public class WeatherForecast
{
    [Key]
    public long Id { get; set; }

}