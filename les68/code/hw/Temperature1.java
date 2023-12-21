package hw;

import java.time.LocalDate;

public class Temperature1 {
    private LocalDate date;
    private int nightTemperature;

    public LocalDate getDate() {
        return date;
    }

    public int getNightTemperature() {
        return nightTemperature;
    }

    public Temperature1(LocalDate date, int nightTemperature) {
        this.date = date;
        this.nightTemperature = nightTemperature;
    }
}
