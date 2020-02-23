package Arrays;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int ar[][]=new int[3][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3X3 Matrix");
		int i,j;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				ar[i][j]=sc.nextInt();
			}
		}
    //System.out.println("The MAtrix is");
	//	System.out.println("The diagonal is");
		System.out.println("The Upper Triangle  is");
    for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			if(i<j )
			System.out.print(ar[i][j]);
			else
				System.out.print(" ");
		}
		System.out.println(" ");
	}
    
	}

}
