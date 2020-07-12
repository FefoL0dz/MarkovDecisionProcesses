package com.jlodes.math.distance;

import com.jlodes.exception.NotYetImplementedException;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class Camberra implements IDistance<Double, Double[]> {

    public static final String TAG = "Camberra";

    @Override
    public Double calculate(Double[] value1, Double[] value2) {
        double distance = 0.0;
        double numeratorSubtract = 0.0;
        double denominatorSum = 0.0;
        for (int i = 0; i < value1.length; i++) {
            numeratorSubtract = value1[i] - value2[i];
            denominatorSum = Math.abs(value1[i]) + Math.abs(value2[i]);
            distance += Math.abs(numeratorSubtract)/denominatorSum;
        }
        return distance;
    }

    @Override
    public Double calculate(Double[][] values) {
        throw new NotYetImplementedException();
    }
}
