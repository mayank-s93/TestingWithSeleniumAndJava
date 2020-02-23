package BasicJavaProgram;

import java.util.Scanner;

public class Devision {
	
	void divi(){
	int m1,m2,m3,m4, avg;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 4 number");
	m1= sc.nextInt();
	m2= sc.nextInt();
	m3= sc.nextInt();
	m4= sc.nextInt();
	
	avg= (m1+m2+m3+m4)/4;
	if(avg>=75)
		System.out.println("Distinction with : "+avg);
	else if(avg>= 60 && avg<75)
		System.out.println("1st division with : "+avg);
	else if(avg>= 50 && avg<60)
		System.out.println("2nd division with : "+avg);
	else
		System.out.println("Student is fail with :"+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Devision d=new Devision();
		d.divi();

	}

}
