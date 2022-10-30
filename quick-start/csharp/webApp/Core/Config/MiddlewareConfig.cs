namespace Core.Config;

public static class MiddlewareConfig
{
    // public static void ConfigureMiddleware(WebApplication app)  // Add middleware to the container
    // {
    //     if (app.Environment.IsDevelopment())
    //     {
    //         app.UseSwagger();
    //         app.UseSwaggerUI();
    //     }

    //     app.UseHttpsRedirection();

    //     app.UseAuthorization();

    //     app.MapControllers();
    // }

    public static void ConfigureMiddleware(this WebApplication app)  // Add middleware to the container
    {
        if (app.Environment.IsDevelopment())
        {
            app.UseSwagger();
            app.UseSwaggerUI();
        }

        app.UseHttpsRedirection();

        app.UseAuthorization();

        app.MapControllers();
    }
}
