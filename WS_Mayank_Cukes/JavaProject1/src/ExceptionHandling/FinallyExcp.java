package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExcp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		String name;
		System.out.println("Enter your name and age");
		try{
			age=sc.nextInt();
			name=sc.next();
			System.out.println(name + " "+age);
		}
catch(InputMismatchException e){
	System.out.println(e);
	System.out.println("Age Should be number");
}
		finally {
			System.out.println("Finally executed");
			sc.close();
		}
		System.out.println("Rest of code...");
	}

}
