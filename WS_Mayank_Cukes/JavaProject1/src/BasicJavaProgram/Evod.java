package BasicJavaProgram;

import java.util.Scanner;

public class Evod {

	void oddEven(){
		
		int a, k;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a nuber");
		a=sc.nextInt();
		k= a%2;
		switch(k){
		case 0:
			System.out.println("The number "+a+ " is even");
			break;
			
		case 1:
			System.out.println("The number "+a+ " is odd");
		}
	}
	void Vowel(){
		String s;
		System.out.println("Enter any charector");
		Scanner sc=new Scanner(System.in);
		s= sc.next();
		
		switch(s){
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("The charector is vowel");
			break;
			default :
				System.out.println("The charector is consonent");
			
		}
	}
	void print(){
		int n,c;
		System.out.println("Enter any nuber");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=1;
		while(c<=n){
			if(c%2==0){
			System.out.println(c);
			c++;
			}
		}
	}
	void fact(){
		int f, c, n;
		System.out.println("Enter any nuber");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=1;
		f=n;
		while (f>1){
			c= c*f;
			f--;
			System.out.println();
		}
		System.out.println("Factorial is :" +c);
	}
	void power(){
		int x,n,p;
		System.out.println("Enter any 2 number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		n=sc.nextInt();
		p=1;
		while(n>=1){
			p*=x;
			n--;
			
		}
		System.out.println("Power is : "+p);
	}
	
	void DigSum(){
		int n,sum=0, r;
		System.out.println("Enter any  number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		do{
			r=n%10;
			sum=sum +r;
			n=n/10;
		}
		while(n>0);
		System.out.println("The Sum is  :"+sum);
	}
	void rev(){
		int n,rev=0, r;
		System.out.println("Enter any  number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		do{
			r=n%10;
			rev=rev*10 +r;
			n=n/10;
		}
		while(n>0);
		System.out.println("The Reverse is  :"+rev);
	}
	
	void prime(){
		int c=2,n,r;
		System.out.println("Enter any  number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(;c<n;c++){
			r=n%c;
			if(r==0){
				System.out.println("The number is not prime");
				break;
			}
		}
		if(c==n)
			System.out.println("The number is prime");
	}
	public static void main(String[] args) {
		
Evod e=new Evod();
//e.oddEven();
//e.Vowel();
//e.print();
//e.fact();
//e.power();
//e.DigSum();
//e.rev();
e.prime();

	}

}
