package com.codeco.sakshath;

import java.util.*;
public class RaiseException {
    public static void main(String agrs[]){
        Scanner s=new Scanner(System.in);
        int a,b,result;
        System.out.println("Enter the Value of a and b:");
        a=s.nextInt();
        b=s.nextInt();
        try{
            result=a/b;
            System.out.println("Result = "+result);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
