package pl.zzpj2021.solid.dip.weathertracker.solution;

public class WeatherTracker {
    String currentConditions;
    Device device;

    public WeatherTracker(Device device) {
        this.device = device;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        String alert = device.generateWeatherAlert(weatherDescription);
        System.out.print(alert);
    }
}
