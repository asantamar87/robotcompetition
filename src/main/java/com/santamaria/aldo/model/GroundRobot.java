package com.santamaria.aldo.model;


import com.santamaria.aldo.util.ResistanceEvaluable;

import java.time.LocalDate;

public class GroundRobot extends Robot implements ResistanceEvaluable {
    private double maxSpeed;
    private TractionType tractionType;

    public GroundRobot(String name, String manufacturer, int manufactureYear, LocalDate registrationDate,
                       double maxSpeed, TractionType tractionType) {
        super(name, manufacturer, manufactureYear, registrationDate);
        this.maxSpeed = maxSpeed;
        this.tractionType = tractionType;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public TractionType getTractionType() {
        return tractionType;
    }

    @Override
    public String getTechnicalDescription() {
        return String.format("%s, fabricado por %s en %d, usa tracción %s y alcanza hasta %.1f km/h.",
                getName(), getManufacturer(), getManufactureYear(), tractionType, maxSpeed);
    }

    @Override
    public String getResistanceReport() {
        return String.format("%s: velocidad máxima de %.1f km/h. %s",
                getName(), maxSpeed,
                (tractionType == TractionType.ORUGAS) ? "Apto para la competición." : "No cumple los requisitos.");
    }


}