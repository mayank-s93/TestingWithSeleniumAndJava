package Part1;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		
		
		int temp ,n, x=0,y=0;

		System.out.println("Please enter your number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		y=n;
		while(n!=0){
			temp=n%10;
			n=n/10;
			x= x+temp*temp*temp;
			
					
		}
		System.out.println("Computed numsber is "+x);
		if(x==y){
			System.out.println("The number is  armstrong");
		}
		else
		{
			System.out.println("Given number is not Armstrong nuber");
		}
		
	}

}
