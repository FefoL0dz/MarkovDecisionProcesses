package com.jlodes.exception;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class UnableToReadFileException extends RuntimeException {

    private final static String message = "Not able to read file!";

    public UnableToReadFileException() {
        super(message);
    }

    public UnableToReadFileException(String errorMessage) {
        super(message + " " + errorMessage);
    }
}