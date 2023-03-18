import java.util.*;
public class Student {
    String name,usn,phone,branch;
     Scanner sc=new Scanner (System.in);
    void insertRecord(){
   
    System.out.println("Enter the USN: ");
    usn=sc.next();
    System.out.println("Enter the Name: ");
    name=sc.next();
    System.out.println("Enter the Branch: ");
    branch=sc.next();
    System.out.println("Enter the Phone No.: ");
    phone=sc.next();    
}
    
    void display(){
       System.out.println(usn+"\t"+name+"\t"+branch+"\t"+phone);
    }
    
    public static void main(String args[]){
    int n,i;
    Student s[]=new Student[100];
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter no. of Student: ");
    n = sc.nextInt();
    for(i=0;i<n;i++){
        System.out.println("Enter the Student Details");
        s[i]=new Student();
        s[i].insertRecord();
    }
    System.out.println("###### STUDENT RECORD ######");
    System.out.println("USN\t\tNAME\t\tBRANCH\tPHONE NO.");
    for(i=0;i<n;i++){
        s[i].display();
    }
    }
    
}
