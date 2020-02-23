package BasicJavaProgram;

import java.util.Scanner;

public class Pattern2 {
	void test1(){
		int n,i,j;
		System.out.println("Enter number of rows you want in pattern");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++){
			for(int k=1 ; k<=n-i;k++){
				System.out.printf(" ");
			}
			for(j=1;j<=i;j++){
				System.out.printf("*");
			}
			System.out.println(" ");
		}
			
		
	}
	public static void main(String[] args) {
		
Pattern2 p=new Pattern2();
p.test1();
	}
}
