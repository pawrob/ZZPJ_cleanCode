package pl.zzpj2021.solid.dip.weathertracker.solution;

public class Main {
    public static void main(String[] args) {
        WeatherTracker tracker = new WeatherTracker("Raining", new PhoneCallGenerator());
        System.out.println(tracker.sendAlert());

        tracker.setWetherAlertGenerator(new EmailGenerator());
        System.out.println(tracker.sendAlert());
    }
}
