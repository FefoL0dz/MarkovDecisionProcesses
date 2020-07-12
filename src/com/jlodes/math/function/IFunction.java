package com.jlodes.math.function;

/**
 Created by: Felipe Lodes in 07/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public interface IFunction<E, T> {
    E execute();
    E execute(T value);
    E execute(T value1, T value);
    E derivative(T value);
}
