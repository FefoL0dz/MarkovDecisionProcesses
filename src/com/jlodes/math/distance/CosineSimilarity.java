package com.jlodes.math.distance;

import com.jlodes.exception.NotYetImplementedException;
import com.jlodes.math.vector.VectorCalculus;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class CosineSimilarity implements IDistance<Double, Double[]> {

    public static final String TAG = "Cosine Similarity";

    @Override
    public Double calculate(Double[] value1, Double[] value2) {
        double distance = 0.0;

        double a = VectorCalculus.produtoEscalar(value1, value2);
        double b = (VectorCalculus.normaEuclidiana(value1) * VectorCalculus.normaEuclidiana(value2));

        if( b == 0 || a == 0 )
            return 0.0;
        distance = a/b;

        return distance;
    }

    @Override
    public Double calculate(Double[][] values) {
        throw new NotYetImplementedException();
    }
}
