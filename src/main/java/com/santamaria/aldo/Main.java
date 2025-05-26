package com.santamaria.aldo;

import com.santamaria.aldo.model.*;
import com.santamaria.aldo.service.RobotRegistry;
import com.santamaria.aldo.util.ResistanceEvaluable;
import com.santamaria.aldo.util.ResistanceReportPrinter;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RobotRegistry registry = new RobotRegistry();

        registry.registerRobot(new GroundRobot("T-1000", "Cyberdyne", 2022, LocalDate.now(), 45.0, TractionType.ORUGAS));
        registry.registerRobot(new GroundRobot("Racer", "SpeedTech", 2023, LocalDate.now(), 65.0, TractionType.RUEDAS));
        registry.registerRobot(new AirRobot("SkyX-1", "AeroCorp", 2023, LocalDate.now(), 3000, 75));
        registry.registerRobot(new AirRobot("FlyBot-3", "SkyLab", 2021, LocalDate.now(), 2500, 45));
        registry.registerRobot(new WaterRobot("AquaRunner", "AquaTech", 2021, LocalDate.now(), 500, PropulsionSystem.HELICE));

        System.out.println("\n--- All Robots ---");
        registry.getAllRobots().forEach(r -> System.out.println(r.getTechnicalDescription()));

        System.out.println("\n--- Ground Robots with speed > 50 km/h ---");
        registry.findFastGroundRobots(50).forEach(r -> System.out.println(r.getTechnicalDescription()));

        System.out.println("\n--- Robots by Manufacturer: 'AquaTech' ---");
        registry.findByManufacturer("AquaTech").forEach(r -> System.out.println(r.getTechnicalDescription()));

        System.out.println("\n--- Resistance Evaluation ---");
        List<ResistanceEvaluable> evaluables = registry.getResistanceCandidates();
        if (evaluables.isEmpty()) {
            System.out.println("No robots available for resistance evaluation.");
            return;
        }
        new ResistanceReportPrinter().printReport(evaluables);
    }
}

