public class RemoteWeather implements WeatherReporter {
    @Override
    public String getReport() {
        return "Remote: Cloudy, 18°C";
    }
}