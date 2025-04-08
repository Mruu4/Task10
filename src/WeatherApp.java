public class WeatherApp {
    private final WeatherReporter reporter;

    public WeatherApp(WeatherReporter reporter) {
        this.reporter = reporter;
    }

    public void showWeather() {
        System.out.println(reporter.getReport());
    }
}