package com.demoqa.utils;

import java.io.File;

public class UploadPicture {
    public static String filePath(String string){
        File file = new File(string);
        String path=file.getAbsolutePath();


        return path;
    }
}
