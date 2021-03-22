package pl.zzpj2021.solid.dip.weathertracker.solution;


import pl.zzpj2021.solid.dip.weathertracker.violation.Emailer;
import pl.zzpj2021.solid.dip.weathertracker.violation.Phone;

import java.util.ArrayList;
import java.util.List;

public class WeatherTracker {
    String currentConditions;
    List<Device> devices;

    public WeatherTracker() {
        devices = new ArrayList<>();
    }

    public void assignDevide(Device device) {
        devices.add(device);
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        devices.forEach(
                x -> {
                    System.out.print(x.generateWeatherAlert(weatherDescription));
                }
                );
        }
}
