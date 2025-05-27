package com.santamaria.aldo.model;

import java.time.LocalDate;

public abstract class Robot {
    private String name;
    private String manufacturer;
    private int manufactureYear;
    private LocalDate registrationDate;

    public Robot(String name, String manufacturer, int manufactureYear, LocalDate registrationDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public abstract String getTechnicalDescription();


}
