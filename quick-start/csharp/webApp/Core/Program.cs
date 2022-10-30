using Core.Config;

var builder = WebApplication.CreateBuilder(args);

builder.ConfigureServices(); //ServiceConfig.ConfigureServices(builder);

var app = builder.Build();

app.ConfigureMiddleware(); //MiddlewareConfig.ConfigureMiddleware(app);

app.Run();