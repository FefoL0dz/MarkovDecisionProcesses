package com.jlodes.math.function;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class Rastrigins implements IFunction<Double, Double> {

    public static final String TAG = "Rastrigins";

    @Override
    public Double execute(Double x, Double y) {
        double result = 20 + Math.pow(x, 2) + Math.pow(y, 2) - (10 * cosineSum(x,y));
        return result;
    }

    private double cosineSum(double x, double y) {
        return Math.cos(2 * Math.PI * x) + Math.cos(2 * Math.PI * y);
    }

    @Override
    public Double execute() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Double execute(Double value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Double derivative(Double value) {
        throw new UnsupportedOperationException();
    }
}
