package com.codeco.sakshath;

import java.util.*;
import java.io.*;

public class arraylistexample {
    public static void main(String args[])throws IOException{
        ArrayList<String> obj=new ArrayList<String>();
        DataInputStream in = new DataInputStream(System.in);
int c,ch;
int i,j;
String str,str1;
do
{
System.out.println("STRING MANIPULATION"); System.out.println("******************************");
System.out.println(" 1. Append at end \t 2.Insert at particular index \t 3.Search \t"); System.out.println( "4.List string that starting with letter \t 5.Display\t" ); 
System.out.println("Enter the choice ");
c=Integer.parseInt(in.readLine());
switch(c){
    case 1:
        System.out.println("Enter the Sring to Append: ");
        str=in.readLine();
                obj.add(str);
                break;
                
    case 2:
        System.out.println("Enter the Sring to Append: ");
        str=in.readLine();
        System.out.println("Specify the postion to insert: ");
        i=Integer.parseInt(in.readLine());
        obj.add(i-1,str);
        System.out.println("The array list has following elements:"+obj); 
        break;
        
    case 3:   
        System.out.println("Enter the Sring to be searched: ");
        str=in.readLine();
        j=obj.indexOf(str);
        if(j==-1)
            System.out.println("Element not Found");
            else
            System.out.println("Index of "+str+" is "+j);
         break;
         
    case 4:
        System.out.println("Enter the character to List string that starts with specified character");
        str=in.readLine();
        for(i=0;i<(obj.size());i++){
            str1=obj.get(i);
            if(str1.startsWith(str)){
                System.out.println(str1);
            }
        }
        break;
    
    case 5: 
        System.out.println("The array list has following elements:"+obj);
        break;
}
        System.out.println("enter 0 to break and 1 to continue");
        ch=Integer.parseInt(in.readLine());
        
}while(ch==1);

}
}