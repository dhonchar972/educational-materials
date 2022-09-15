package com.patterns.structural.adapter.adapters;

import com.patterns.structural.adapter.round.RoundPeg;
import com.patterns.structural.adapter.square.SquarePeg;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.width() / 2), 2) * 2));
        return result;
    }
}
