import java.util.*;

class ComputeArea{
void area(double r){
double area;
area=3.14*r*r;
System.out.println("Area of Circle: "+area);
}

void area(float side){
double area;
area=Math.pow(side,2);
System.out.println("Area of Square: "+area);
}

void area(float len,float wid){
double area;
area=len*wid;
System.out.println("Area of Rectangle: "+area);
}

public static void main(String args[]){
Scanner s=new Scanner();
ComputeArea c=new ComputeArea();
System.out.println("Enter the Radius of the cirle: ")
double r=s.nextDouble();
c.area(r);
System.out.println("Enter the Side of the Square: ")
float side=s.nextFloat();
c.area(side);
System.out.println("Enter the Length and Width of the Rectangle: ")
float len=s.nextFloat();
float wid=s.nextFloat();
c.area(len,wid);
}
}
