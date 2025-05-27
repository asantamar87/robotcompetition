package com.santamaria.aldo.model;

import com.santamaria.aldo.util.ResistanceEvaluable;

import java.time.LocalDate;

public class AirRobot extends Robot implements ResistanceEvaluable {
    private double maxAltitude;
    private int flightAutonomy;

    public AirRobot(String name, String manufacturer, int manufactureYear, LocalDate registrationDate, double maxAltitude, int flightAutonomy) {
        super(name, manufacturer, manufactureYear, registrationDate);
        this.maxAltitude = maxAltitude;
        this.flightAutonomy = flightAutonomy;
    }

    public double getMaxAltitude() {
        return maxAltitude;
    }

    public int getFlightAutonomy() {
        return flightAutonomy;
    }

    @Override
    public String getTechnicalDescription() {
        return String.format("%s vuela hasta %.0f m durante %d minutos. Fabricado en %d por %s.",
                getName(), maxAltitude, flightAutonomy, getManufactureYear(), getManufacturer());
    }

    @Override
    public String getResistanceReport() {
        return String.format("%s: altitud máxima de %.0f m y autonomía de %d minutos. %s",
                getName(), maxAltitude, flightAutonomy,
                (flightAutonomy >= 60) ? "Apto para la competición." : "No cumple los requisitos.");
    }
}

