package BasicJavaProgram;

import java.util.Scanner;

public class Pattern1 {

	void test1(){
		int n,i,j;
		System.out.println("Enter number of rows you want in pattern");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.printf(j + " ");
			}
			System.out.println( );
		}
	}
		void test2(){
			int n1,i,j;
			System.out.println("Enter number of rows you want in pattern");
			Scanner sc=new Scanner(System.in);
			
			n1=sc.nextInt();
			
			for(i=1;i<=(2*n1-1);i++){
				for(j=1;j<=i;j++){
					System.out.printf(j + " ");
				}
				System.out.println( );
			}
	}
	public static void main(String[] args) {
		
Pattern1 p=new Pattern1();
p.test1();
	}

}
