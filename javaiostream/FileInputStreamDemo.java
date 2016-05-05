/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.javaiostream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Navin
 */
public class FileInputStreamDemo {

    public static void main(String[] args) {
        FileInputStream fis = null;
        int c;
        try {
            fis = new FileInputStream("D:/output.txt");
            while((c = fis.read())!=-1){
                System.out.print((char)c);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

}
