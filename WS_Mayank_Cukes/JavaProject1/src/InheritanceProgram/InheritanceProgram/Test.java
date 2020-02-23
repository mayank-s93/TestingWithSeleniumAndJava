package InheritanceProgram;

import java.util.Scanner;

class Parent{
	
	int age;
	String name;

	Scanner sc=new Scanner(System.in);
void input(){
	System.out.println("Input Age. And Name ");
	age=sc.nextInt();
	name=sc.next();
}
void show(){
	System.out.println("Age :"+age);
	System.out.println("Name :"+name);
	
}
}
class Student1 extends Parent{
	int rn;
	void inputS(){
		input();
	System.out.println("Input Roll number ");
	rn=sc.nextInt();
	
}
	void showS(){
		show();
		System.out.println("Roll no :"+rn);
		
		
	}
	
}

class Employee extends Parent{
	int emp;
	void inputE(){
		input();
	
	System.out.println("Input employee ID ");
	emp=sc.nextInt();
	
}
	void showE(){
		show();
		System.out.println("Employee ID :"+emp);	
	}
	
}

public class Test {

	public static void main(String[] args) {
		
		Student1 s1=new Student1();
		Employee e1=new Employee();
		
		//s1.inputS();
		//s1.showS();
		e1.inputE();
		e1.showE();
	}

}
