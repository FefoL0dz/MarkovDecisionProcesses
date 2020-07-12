package com.jlodes.log;

import com.jlodes.exception.NotYetImplementedException;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public abstract class Logger {

    static Logger instance;

    public static final Logger getInstance() {
        if (instance == null)
            instance = new Logger() {
                @Override
                public void logException(Exception error) {
                    throw new NotYetImplementedException();
                }
            };
        return instance;
    }

    public abstract void logException(Exception error);
}
