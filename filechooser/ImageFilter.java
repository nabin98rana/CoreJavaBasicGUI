/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabin.filechooser;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Navin
 */
public class ImageFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
       String fileName=f.getName();
       
       if(f.isDirectory()){
       return true;
       }
       String extension=getExtension(fileName);
       if(extension.equals("jpg")){
       return true;
       }
       if(extension.equals("jpeg")){
       return true;
       }
       if(extension.equals("gif")){
       return true;
       }
       if(extension.equals("bmp")){
       return true;
       }
       return false;
    }

    @Override
    public String getDescription() {
        return "Just Images";
    }

    private String getExtension(String fileName) {
        String ext=null;
        int i=fileName.lastIndexOf(".");
        if(i>0 && i<fileName.length()){
        ext=fileName.substring(i+1);
        
        }
        return ext.toLowerCase();
    }
    
}
