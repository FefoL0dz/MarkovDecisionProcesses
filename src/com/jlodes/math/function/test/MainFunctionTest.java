package com.jlodes.math.function.test;

import com.jlodes.math.function.IFunction;
import com.jlodes.math.function.Sigmoid;

/**
 Created by: Felipe Lodes in 07/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class MainFunctionTest {
    public static void main(String[] args) {
        IFunction<Double, Double> function;
        function = new Sigmoid();
        print(function.execute(-0.1));
        print(function.execute(0.1));
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}
