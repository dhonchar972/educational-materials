package com.patterns.structural.adapter.round;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public record RoundHole(double radius) {

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.radius() >= peg.getRadius());
        return result;
    }
}
