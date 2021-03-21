package pl.zzpj2021.solid.dip.weathertracker.solution;


import pl.zzpj2021.solid.dip.weathertracker.violation.Emailer;
import pl.zzpj2021.solid.dip.weathertracker.violation.Phone;

public class WeatherTracker {
    String currentConditions;

    WetherAlertGenerator wetherAlertGenerator;

    public WeatherTracker(String currentConditions, WetherAlertGenerator wetherAlertGenerator) {
        this.currentConditions = currentConditions;
        this.wetherAlertGenerator = wetherAlertGenerator;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        String alert = wetherAlertGenerator.generateWeatherAlert(weatherDescription);
        System.out.print(alert);
    }

    public void setWetherAlertGenerator(WetherAlertGenerator wetherAlertGenerator) {
        this.wetherAlertGenerator = wetherAlertGenerator;
    }

    public String sendAlert(){
        return wetherAlertGenerator.generateWeatherAlert(currentConditions);
    }
}
