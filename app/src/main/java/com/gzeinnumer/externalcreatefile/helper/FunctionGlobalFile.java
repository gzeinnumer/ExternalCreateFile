package com.gzeinnumer.externalcreatefile.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FunctionGlobalFile {

    //create file
    public static boolean initFile(String text) {
        File file;
        file = new File(FunctionGlobalDir.getStorageCard + FunctionGlobalDir.appFolder + "/File.txt");
        try{
            FileOutputStream f = new FileOutputStream(file);
            PrintWriter writer = new PrintWriter(f);
            writer.println(text+"1");
            writer.println(text+"2");
            writer.println(text+"3");
            writer.flush();
            writer.close();
            f.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }
}
