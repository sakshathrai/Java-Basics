package com.codeco.sakshath;

//Write a program to generate the resume. Create 2 Java classes Teacher (data: personal information, qualification, 
//experience, achievements) and Student (data: personal information, result, discipline) which implements the java 
//interface Resume with the method biodata ().


import java.util.*;
interface Resume{
    void biodata();
}

class Teacher implements Resume{
    @Override
    public void biodata(){
        Scanner sc=new Scanner(System.in);
        String name,dob,bg,age,ach,exp,qual;
        System.out.println("Enter the Name, Date of Birth(DD/MM/YYYY), age, Blood Group ");
        name=sc.nextLine();
        dob=sc.nextLine();
        bg=sc.nextLine();
        age=sc.nextLine();
        System.out.println("Enter the Qualification, Experience (in year), Achievements");
        qual=sc.nextLine();
        exp=sc.nextLine();
        ach=sc.nextLine();
        
        System.out.println("\n\nTeacher Resume");
        System.out.println("\nName: "+name+"\nDate of Birth: "+dob+"\nAge: "+age+"\nBlood Group: "+bg+"\nQualification: "+qual+"\nExperience: "+exp+"\nAchievements: "+ach);
        
        
    }
}

class Student implements Resume{
    @Override
    public void biodata(){
        Scanner sc=new Scanner(System.in);
        String name,dob,bg,age,branch,sem,section;
        float per,cgpa;
        System.out.println("\n\nEnter the Name, Date of Birth(DD/MM/YYYY), age, Blood Group ");
        name=sc.nextLine();
        dob=sc.nextLine();
        bg=sc.nextLine();
        age=sc.nextLine();
        System.out.println("Enter the Discipline i. Branch ii. Semester iii. Section");
        branch=sc.nextLine();
        sem=sc.nextLine();
        section=sc.nextLine();
        System.out.println("Enter the Results i. Percentage ii. CGPA");
        per=sc.nextFloat();
        cgpa=sc.nextFloat();
        System.out.println("\n\nStudent Resume");
        System.out.println("\nName: "+name+"\nDate of Birth: "+dob+"\nAge: "+age+"\nBlood Group: "+bg+"\nBranch: "+branch+"\nSemester: "+sem+"\nSection: "+section+"\nPercentage: "+per+"\nCGPA: "+cgpa);
        
        
    }
} 
public class MainClass {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Student s =new Student();
        Teacher t=new Teacher();
        t.biodata();
        s.biodata();
    }
    
}
