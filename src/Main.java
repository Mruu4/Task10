public class Main {
    public static void main(String[] args) {
        WeatherApp localApp = new WeatherApp(new LocalWeather());
        localApp.showWeather();

        WeatherApp remoteApp = new WeatherApp(new RemoteWeather());
        remoteApp.showWeather();
    }
}