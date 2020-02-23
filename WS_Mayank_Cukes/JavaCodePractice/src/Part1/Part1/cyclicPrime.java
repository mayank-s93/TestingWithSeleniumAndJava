package Part1;

import java.util.Scanner;

public class cyclicPrime {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		
		do{
		if(IsPrime(a)==false){
			System.out.println("Given number is not prime");
		}else{
			a=cyclicPrime(a);
			
		}
		}while(a!=n);
		System.out.println(n+" is circular prime number");
	}

	static boolean IsPrime(int m){
		int count=0;
		for(int i=1;i<=m;i++){
			if(m%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println(m+ " Is a prime number");
			int k=cyclicPrime(m);
			
		}
		return(true);
	}
	static int cyclicPrime(int m){
		String s=Integer.toString(m);
		s=s.substring(1)+s.charAt(0);
		int p=Integer.parseInt(s);
		return p;
	}
}
