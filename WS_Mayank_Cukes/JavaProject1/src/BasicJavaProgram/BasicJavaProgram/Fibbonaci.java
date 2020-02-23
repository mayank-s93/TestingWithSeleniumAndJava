package BasicJavaProgram;

import java.util.Scanner;

public class Fibbonaci {

	void testfib(){
		
		int n , sum, prev1=1, prev2=0;
		System.out.println("Enter number of terms you want to print");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==1)
			System.out.println(0);
		else if(n>=2){
			System.out.println(0);
			System.out.println(1);
			for(int c=3;c<=n;c++){
				sum =prev1+prev2;
				System.out.println(sum);
				prev2=prev1;
				prev1=sum;
			}
		}
	}
	
	public static void main(String[] args) {
		
Fibbonaci f=new Fibbonaci();
f.testfib();
	}

}
