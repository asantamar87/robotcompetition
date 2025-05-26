package com.santamaria.aldo.model;

import java.time.LocalDate;

public class WaterRobot extends Robot {
    private double maxDepth;
    private PropulsionSystem propulsionSystem;

    public WaterRobot(String name, String manufacturer, int manufactureYear, java.time.LocalDate registrationDate,
                      double maxDepth, PropulsionSystem propulsionSystem) {
        super(name, manufacturer, manufactureYear, registrationDate);
        this.maxDepth = maxDepth;
        this.propulsionSystem = propulsionSystem;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public PropulsionSystem getPropulsionSystem() {
        return propulsionSystem;
    }

    @Override
    public String getTechnicalDescription() {
        return String.format("%s alcanza una profundidad de %.1f m con propulsión tipo %s. Fabricado por %s en %d.",
                getName(), maxDepth, propulsionSystem, getManufacturer(), getManufactureYear());
    }
}