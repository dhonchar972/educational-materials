package com.patterns.structural.adapter.round;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
