package com.codeco.sakshath;
import java.util.*;
import java.io.*;
public class FileP {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file Name: ");
        String fname=sc.next();
        File f1=new File(fname);
        f1.setWritable(true);
        if(f1.exists())
            System.out.println("File exists");
        else
            System.out.println("File Does not exists");
        
       if(f1.canWrite())
           System.out.println("File is writeable");
        else
            System.out.println("File is not writeable");
       if(f1.canRead())
           System.out.println("File is Readable");
        else
            System.out.println("File is not Readable");
       String filename=f1.toString();
       int index=filename.lastIndexOf('.');
       if(index>0){
           String type=filename.substring(index+1);
           System.out.println("File type is "+type);}
           else{
               System.out.println("File file doesn't have type");     
                   }
        System.out.println("File size: "+f1.length()+" Byte");     
        
       }
           
    }
    

