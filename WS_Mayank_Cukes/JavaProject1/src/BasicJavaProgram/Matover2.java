package BasicJavaProgram;

import java.util.Scanner;

public class Matover2 {

	/*void sum(int a,int b){
		int sum;
		sum=a+b;
		System.out.println("Sum of int :" +sum);
	}*/
	void sum(float a,float b){
		float sum;
		sum=a+b;
		System.out.println("Sum of float :" +sum);
	}
	public static void main(String[] args) {
		Matover2 m=new Matover2();
		Scanner sc=new Scanner(System.in);
		int x,y;
		float p,q;
		System.out.println( "Enter two integer");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println( "Enter two Float");
		p=sc.nextFloat();
		q=sc.nextFloat();
		m.sum(x, y);
		m.sum(p, q);
	}

}
