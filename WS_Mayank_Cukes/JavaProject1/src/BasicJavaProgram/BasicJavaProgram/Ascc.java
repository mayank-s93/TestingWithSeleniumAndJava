package BasicJavaProgram;

import java.util.Scanner;

public class Ascc {

	void asc(){
		/*System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);*/
		int i= 56;
				//sc.nextInt();
			System.out.printf(Integer.toString(i));
			
				
	}
	public static void main(String[] args) {
		Ascc a=new Ascc();
		a.asc();

	}

}
class B extends Ascc {
	void asc(){
		System.out.printf("Child class");
	}
	
}
