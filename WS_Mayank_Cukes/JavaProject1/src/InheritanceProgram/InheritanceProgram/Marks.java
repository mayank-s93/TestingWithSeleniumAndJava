package InheritanceProgram;

import java.util.Scanner;

class Student{
	int r;
	String name;
	
	Scanner sc=new Scanner(System.in);
void input(){
	System.out.println("Input Roll no. And Name of sexy Student");
	r=sc.nextInt();
	name=sc.next();
}
void show(){
	System.out.println("Roll no :"+r);
	System.out.println("Name :"+name);
	
}
}
public class Marks extends Student {
	float m1,m2;
	void inputMarks(){
		
		System.out.println("Input 2 subject marks");
		m1=sc.nextFloat();
		m2=sc.nextFloat();
	}
	void showMarks(){
		System.out.println("marks in 1st subject :"+m1);
		System.out.println("marks in 2nd subject :"+m2);
		
	}

	public static void main(String[] args) {
		
		Marks obj=new Marks();
		obj.input();
		obj.inputMarks();
		obj.show();
		obj.showMarks();

	}

}
