package com.jlodes.utils;

/**
 Created by: Felipe Lodes in 12/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class Printer {

    public static void println(Object o) {
        System.out.println(o);
    }

    public static void print(Object o) {
        System.out.print(o);
    }

    public static void printVector(Double[] vector) {
        print("[");
        int i = 0;
        for (; i < vector.length - 1; i++)
            print(vector[i] + ", ");
        println(vector[i] + "]");
    }

    public static void printOutput(Double[] vector, double threshold) {
        print("[");
        int i = 0;
        for (; i < vector.length - 1; i++)
            print((vector[i] > threshold ? 1.0 : 0.0) + ", ");
        println((vector[i] > threshold ? 1.0 : 0.0) + "]");
    }

    public static void printOutput(Double[] vector) {
        print("[");
        int i = 0;
        for (; i < vector.length - 1; i++)
            print(vector[i] + ", ");
        println(vector[i] + "]");
    }
}
