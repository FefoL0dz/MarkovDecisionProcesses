package com.jlodes.io;


import com.jlodes.exception.UnableToCreateFolderException;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 Created by: Felipe Lodes in 11/04/2020.

 *Copyright (c) 2020 FelipeLodes to Present. All rights reserved.*

 **/

public class FolderUtils {

    public static void createFolder(final String path) {
        if(!isFolderCreated(path)) {
            boolean success = (new File(path)).mkdirs();

            if(!success)
                throw new UnableToCreateFolderException(" : " + path);
        }
    }

    public static boolean isFolderCreated(final String path) {
        return Files.exists(Paths.get(path));
    }
}
