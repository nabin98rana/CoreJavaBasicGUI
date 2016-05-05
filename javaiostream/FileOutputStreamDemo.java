/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.javaiostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.Scanner;


/**
 *
 * @author Navin
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) {
       FileOutputStream fos=null;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=input.nextLine();
        System.out.println("Welcome:"+name);
       try{
            fos=new FileOutputStream("D:/output.txt");
            fos.write(name.getBytes());
       }catch(IOException ioe){
           System.out.println(ioe.getMessage());
       }
        
    }

}
