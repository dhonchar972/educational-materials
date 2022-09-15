package com.patterns.structural.adapter.square;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public record SquarePeg(double width) {

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
