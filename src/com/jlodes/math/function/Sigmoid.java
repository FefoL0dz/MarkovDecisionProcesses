package com.jlodes.math.function;

/**
 Created by: Felipe Lodes in 07/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class Sigmoid implements IFunction<Double, Double> {

    public static final String TAG = "Sigmoid";

    @Override
    public Double execute() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Double execute(Double value) {
        return (1/( 1 + Math.pow(Math.E, (-1 * value) )));
    }

    @Override
    public Double execute(Double value1, Double value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Double derivative(Double value) {
        Double result = execute(value);
        return result * (1 - result);
    }
}
