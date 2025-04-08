public class LocalWeather implements WeatherReporter {
    @Override
    public String getReport() {
        return "Local: Sunny, 22°C";
    }
}