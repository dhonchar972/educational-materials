using Microsoft.Extensions.Logging;

namespace ConsoleApp
{
    public class Moq : IMoq
    {
        private readonly ILogger<Moq> _logger;

        public Moq(ILogger<Moq> logger)
        {
            _logger = logger;
        }

        public void DoSomething()
        {
            _logger.LogInformation("Hello from Moq!!!");
        }
    }
}