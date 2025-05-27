package com.santamaria.aldo.service;

import com.santamaria.aldo.model.GroundRobot;
import com.santamaria.aldo.model.Robot;
import com.santamaria.aldo.util.ResistanceEvaluable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RobotRegistry {
    private final List<Robot> robots = new ArrayList<>();

    public void registerRobot(Robot robot) {
        robots.add(robot);
    }

    public List<Robot> getAllRobots() {
        return robots;
    }

    public List<Robot> findByManufacturer(String manufacturer) {
        return robots.stream()
                .filter(r -> r.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
    }

    //FILTRAR robots que son GroundRobot y tienen una velocidad máxima mayor a minSpeed
    public List<GroundRobot> findFastGroundRobots(double minSpeed) {
        return robots.stream()
                .filter(r -> r instanceof GroundRobot)
                .map(r -> (GroundRobot) r)
                .filter(gr -> gr.getMaxSpeed() > minSpeed)
                .collect(Collectors.toList());
    }

    public List<ResistanceEvaluable> getResistanceCandidates() {
        return robots.stream()
                .filter(r -> r instanceof ResistanceEvaluable)
                .map(r -> (ResistanceEvaluable) r)
                .collect(Collectors.toList());
    }
}
