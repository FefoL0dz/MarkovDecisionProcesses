package com.jlodes.math.distance;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class SquaredEuclidean extends Euclidean implements IDistance<Double, Double[]> {

    public static final String TAG = "Squared Euclidean";

    @Override
    public Double calculate(Double[] value1, Double[] value2) {
       return Math.pow(super.calculate(value1, value2), 2);
    }
}
