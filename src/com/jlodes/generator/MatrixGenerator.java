package com.jlodes.generator;

/**
 Created by: Felipe Lodes in 07/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class MatrixGenerator implements IRandomGenerator<Double[][], Double[][]> {

    @Override
    public Double[][] generate(Double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = generateDouble();
            }
        }
        return matrix;
    }
}
