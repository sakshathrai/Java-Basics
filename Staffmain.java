Program: Design a super class called Staff with details as Staff Id, Name, Phone, and Salary. Extend
this class by writing three subclasses namely Teaching (domain, publications), Technical (skills), and
Contract (period).
Write a Java program to read and display at least 3 staff objects of all three categories


import java.util.*;
class staff{
	String id,name,phone,salary;
	Scanner sc=new Scanner();
	void read(){
	System.out.print("Enter the Staff ID: ");
	id=sc.next();
	System.out.print("Enter the Staff Name: ");
	name=sc.next();
	System.out.println("Enter the Staff Phone No: ");
	phone=sc.next();
	System.out.println("Enter the Staff Salary: ");
	salary=sc.next();
	}
	void display(){
		System.out.println("Staff ID: "+id+"\nStaff Name: "+name+"\nStaff Phone No.: "+phone+"\nStaff Salary: "+salary);
	}
}
	
	
	class Teaching extends staff{
		String domain;
		int pub;
		Scanner sc=new Scanner();
	void read(){
		super.read();
	System.out.print("Enter the Domain: ");
	domain=sc.next();
	System.out.print("Enter the Publications: ");
	pub=sc.nextInt();
	}
	void display(){
		super.display();
		System.out.println("Domain: "+domain+"\nPublications: "+pub);
	}
	}
	
	
	
	class Technical extends staff{
		String skill;
		Scanner sc=new Scanner();
	void read(){
		super.read();
	System.out.print("Enter the Skill: ");
	skill=sc.next();
	}
	void display(){
		super.display();
		System.out.println("Skill: "+skill);
	}
	}
	
	class Technical extends staff{
		String skill;
		Scanner sc=new Scanner();
	void read(){
		super.read();
	System.out.print("Enter the Skill: ");
	skill=sc.next();
	}
	void display(){
		super.display();
		System.out.println("Skill: "+skill);
	}
	}
	
	
    class Contract extends staff{
		int period;
		Scanner sc=new Scanner();
	void read(){
		super.read();
	System.out.print("Enter the Contract Period: ");
	period=sc.nextInt();
	}
	void display(){
		super.display();
		System.out.println("Period: "+period);
	}
	}
	
	public Staffmain{
	public static void main(String args[]){
	Teaching teach=new Teaching();
	Technical tech=new Technical();
	Contract cont=new Contract();
	System.out.println("Enter the Teaching Staff Information: ");
	teach.read();
	System.out.println("Enter the Technical Staff Information: ");
	tech.read();
	System.out.println("Enter the Contract	Staff Information: ");
	cont.read();
	System.out.println("\n\n****Teaching Staff Information****");
	teach.display();
	System.out.println("\n\n****Technical Staff Information****");
	tech.display();
	System.out.println("\n\n****Contract Staff Information****");
	cont.display();
	}
	}
		