package com.jlodes.math.distance;

/**
 Created by: Felipe Lodes in 07/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public interface IDistance<E, T> {
    E calculate(T value1, T value2);
    E calculate(T[] values);
}
