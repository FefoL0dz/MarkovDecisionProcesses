package com.jlodes.exception;

/**
 Created by: Felipe Lodes in 07/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class NotYetImplementedException extends RuntimeException {

    private final static String message = "Not yet implemented!";

    public NotYetImplementedException() {
        super(message);
    }
}
