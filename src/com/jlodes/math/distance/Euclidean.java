package com.jlodes.math.distance;

import com.jlodes.exception.NotYetImplementedException;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class Euclidean implements IDistance<Double, Double[]> {

    public static final String TAG = "Euclidean";

    @Override
    public Double calculate(Double[] value1, Double[] value2) {
        double distance = 0.0;
        double subtract = 0.0;
        double sum = 0.0;

        for(int i=0;i<value1.length;i++) {
            subtract = value1[i] - value2[i];
            sum += Math.pow(subtract, 2);
        }
        distance = Math.sqrt(sum);

        return distance;
    }

    @Override
    public Double calculate(Double[][] values) {
        throw new NotYetImplementedException();
    }
}
