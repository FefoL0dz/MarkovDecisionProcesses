package com.jlodes.math.vector;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class VectorCalculus {

    public static Double[] sum(Double[] vector1, Double[] vector2) {
        Double newVector[]= new Double[vector1.length];
        for (int i = 0; i < newVector.length; i++) {
            newVector[i] = vector1[i] + vector2[i];
        }
        return newVector;
    }

    public static Double[] division(Double[] vector, int scalar) {
        Double division = (double) 1/scalar;
        return productVectorScalar(vector, division);
    }

    public static Double[] productVectorScalar(Double[] vector, Double scalar) {
        //TODO check if this is the best name
        Double newVector[]= new Double[vector.length];
        for (int i = 0; i < newVector.length; i++) {
            newVector[i]= (vector[i] * scalar);
        }
        return newVector;
    }

    public static Double normaEuclidiana(Double[] vector) {
        // TODO Translate to english
        Double result = 0.0;
        Double counter = 0.0;
        for(int i = 0 ; i < vector.length; i++)
            counter += Math.pow(vector[i], 2);
        result = Math.sqrt(counter);
        return result;
    }

    public static Double produtoEscalar(Double[] vector1, Double[] vector2) {
        // TODO Check if this is the scalar inner product or dot product or another
        Double counter = 0.0;
        for(int i=0; i < vector1.length; i++)
            counter += (vector1[i] * vector2[i]);
        return counter;
    }
}
