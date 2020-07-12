package com.jlodes.math.normalization.variation;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class Variation {

    private double variableMin;

    private double variableMax;

    private int numberOfRepresentationBits;

    private double q; // this variable represents the normalization factor

    public Variation(double min, double max, int numberOfRepresentationBits) {
        this.variableMax = max;
        this.variableMin = min;
        this.numberOfRepresentationBits = numberOfRepresentationBits;
        calculateNormalizationConstant();
    }

    private void calculateNormalizationConstant() {
        q = (variableMax - variableMin)/( Math.pow(2, numberOfRepresentationBits) -1);
    }

    public double getNormalizedValue(int value) {
        double result;
        result = (value * q) + variableMin;
        return result;
    }

    //exhibitors
    public void showFactor() {
        System.out.println("Factor: " + q);
    }

    public void showMinValue() {
        System.out.println("Min variable: " + this.variableMin);
    }

    public void showMaxValue() {
        System.out.println("Max variable: " + this.variableMax);
    }

    public void showNumberOfRepresentationBits() {
        System.out.println("Number Of Representation Bits: " + this.numberOfRepresentationBits);
    }
}