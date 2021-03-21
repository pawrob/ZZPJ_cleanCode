package pl.zzpj2021.solid.dip.weathertracker.solution;

public class PhoneCallGenerator implements WetherAlertGenerator{

    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions + " phone alert";
        return alert;
    }
}
