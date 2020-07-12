package com.jlodes.generator;

/**
 Created by: Felipe Lodes in 07/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class VectorGenerator implements IRandomGenerator<Double[], Double[]> {

    @Override
    public Double[] generate(Double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generateDouble();
        }
        return vector;
    }
}
