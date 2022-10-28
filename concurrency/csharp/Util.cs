static class Util
{
    public static async Task<string> DownloadString(HttpClient client, string uri)
    {
        var response = await client.GetAsync(uri);
        return await response.Content.ReadAsStringAsync();
    }

    public static async Task<string> DownloadStringAsString(HttpClient client, string uri)
    {
        return await client.GetStringAsync(uri);
    }

    public static async Task<string> DownloadStringWithTimeout(HttpClient client, string uri)
    {
        using var cts = new CancellationTokenSource(TimeSpan.FromSeconds(3));
        Task<string> downloadTask = client.GetStringAsync(uri);
        Task timeoutTask = Task.Delay(Timeout.InfiniteTimeSpan, cts.Token);
        Task completedTask = await Task.WhenAny(downloadTask, timeoutTask);
        if (completedTask == timeoutTask)
            return null;
        return await downloadTask;
    }

    public static async Task<string> DownloadStringWithTimeoutAndHeader(HttpClient client, string uri)
    {
        HttpRequestMessage requestMessage = new HttpRequestMessage(HttpMethod.Get, uri);
        //requestMessage.Headers.Add("User-Agent", "User-Agent-Here");
        HttpResponseMessage response = await client.SendAsync(requestMessage);
        var str = await response.Content.ReadAsStringAsync();
        return str;
    }
}