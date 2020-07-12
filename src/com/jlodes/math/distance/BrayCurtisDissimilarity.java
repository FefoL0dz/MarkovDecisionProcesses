package com.jlodes.math.distance;

import com.jlodes.exception.NotYetImplementedException;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class BrayCurtisDissimilarity implements IDistance<Double, Double[]> {

    public static final String TAG = "Bray-Curtis Dissimilarity";

    @Override
    public Double calculate(Double[] value1, Double[] value2) {
        Double distance = 0.0;
        Double denominatorCounter=0.0;
        Double numeratorCounter=0.0;
        for (int i = 0; i < value1.length; i++) {
            denominatorCounter+=(value1[i] + value2[i]);
            numeratorCounter+=Math.abs((value1[i] - value2[i]));
        }
        distance = numeratorCounter/denominatorCounter;

        return distance;
    }

    @Override
    public Double calculate(Double[][] values) {
        throw new NotYetImplementedException();
    }
}
