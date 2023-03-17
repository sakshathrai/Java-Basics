import java.util.*;
public class QuadraticEquation {
    public static void main (String args[])
    {
    double a,b,c,determinant,r,m,n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Value of co-efficient a: ");
    a=s.nextDouble();
    System.out.println("Enter the Value of co-efficient b: ");
    b=s.nextDouble();
    System.out.println("Enter the Value of co-efficient :c ");
    c=s.nextDouble();
    determinant=(b*b)-(4*a*c);
    r=Math.sqrt(determinant);
    if(determinant>0){
        m=(-b+r)/(2*a);
        n=(-b-r)/(2*a);
        System.out.println("The roots are real and distinct \n m= "+m+" n= "+n);
     }
    else if(determinant==0){
        m=(-b)/(2*a);
        n=m;
        System.out.println("The roots are real and equal \n m= "+m+" n= "+n);
    }
    else{
        System.out.println("The roots are Imaginary ");
    }
    }
    
    
}