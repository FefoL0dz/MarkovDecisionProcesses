package com.jlodes.math.distance;

import com.jlodes.exception.NotYetImplementedException;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class Chebyshev implements IDistance<Double, Double[]> {

    public static final String TAG = "Chebyshev";

    @Override
    public Double calculate(Double[] value1, Double[] value2) {
        double subtract = 0.0;
        double maxDistance = 0.0;
        for (int i = 0; i < value1.length; i++) {
            subtract = Math.abs(value1[i] - value2[i]);
            if(subtract > maxDistance)
                maxDistance = subtract;
        }
        return maxDistance;
    }

    @Override
    public Double calculate(Double[][] values) {
        throw new NotYetImplementedException();
    }
}
