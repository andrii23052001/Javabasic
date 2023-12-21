package hw;

import java.time.LocalDate;

public class Temperature {
        private LocalDate date;
        private int nightTemperature;

    public Temperature(LocalDate date, int nightTemperature) {
        this.date = date;
        this.nightTemperature = nightTemperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getNightTemperature() {
        return nightTemperature;
    }
}
