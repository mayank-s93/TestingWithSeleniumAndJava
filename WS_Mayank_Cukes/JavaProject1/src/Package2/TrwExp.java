package Package2;

import java.util.Scanner;

public class TrwExp {

	static void Validate(int age){
		if (age<18)
			try {
				throw new NewException("Minor Exception");
			} catch (NewException e) {
				
				e.printStackTrace();
			}
		System.out.println("Welcome for voting");
		
			
	}
	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age , Please !!");
		age=sc.nextInt();
		Validate(age);
		System.out.println("Rest of code...");
	}

}
