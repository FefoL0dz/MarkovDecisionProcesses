package com.jlodes.generator;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class IntGenerator implements IRandomGenerator<Integer, Integer> {

    @Override
    public Integer generate(Integer value) {
        return generateInt() % value;
    }
}
