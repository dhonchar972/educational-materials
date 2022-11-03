namespace Core.Repositories;

public class WeatherRepository : IWeatherRepository
{
    private static readonly int _staticValue;
    private static readonly int _staticValueTwo = 1;
    private const int CONST_VALUE = 1; // always static
    private readonly string _readonlyValue = new String("Some value");
    private readonly DateTime _tymeCreated;
    public DateTime TymeCreated
    {
        get { return _tymeCreated; }
        init { _tymeCreated = value; }
    }
    private ILogger<WeatherRepository> Logger { get; }

    static WeatherRepository()
    {
        _staticValue = 0;
    }

    public WeatherRepository(ILogger<WeatherRepository> logger)
    {
        Logger = logger;
    }

    public void DoSomeWork(string taskName)
    {
        Logger.LogDebug("DoWork!");
        throw new NotImplementedException();
    }
}