package com.jlodes.math.distance;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class CosineDistance extends CosineSimilarity implements IDistance<Double, Double[]> {

    public static final String TAG = "Cosine Distance";

    @Override
    public Double calculate(Double[] value1, Double[] value2) {
        return 1 - super.calculate(value1, value2);
    }
}
