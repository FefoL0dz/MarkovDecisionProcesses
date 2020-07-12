package com.jlodes.exception;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class UnableToCreateFolderException  extends RuntimeException {

    private final static String message = "Not able to create folder!";

    public UnableToCreateFolderException() {
        super(message);
    }

    public UnableToCreateFolderException(String path) {
        super(message + path);
    }
}

