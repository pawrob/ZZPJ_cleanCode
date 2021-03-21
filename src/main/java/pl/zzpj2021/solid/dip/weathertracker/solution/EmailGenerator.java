package pl.zzpj2021.solid.dip.weathertracker.solution;


public class EmailGenerator implements WetherAlertGenerator {

    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions + " email alert";
        return alert;
    }
}
