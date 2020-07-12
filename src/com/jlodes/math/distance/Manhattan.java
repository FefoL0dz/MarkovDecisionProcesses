package com.jlodes.math.distance;

import com.jlodes.exception.NotYetImplementedException;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class Manhattan implements IDistance<Double, Double[]> {

    public static final String TAG = "Manhattan";

    @Override
    public Double calculate(Double[] value1, Double[] value2) {
        double sum = 0;
        for(int i = 0; i < value1.length; i++) {
            sum += Math.abs(value1[i] - value2[i]);
        }
        return sum;
    }

    @Override
    public Double calculate(Double[][] values) {
        throw new NotYetImplementedException();
    }
}
