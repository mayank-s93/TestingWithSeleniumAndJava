package CodePractice;


import java.util.Scanner;

public class PatternPractice1 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
		/*
		 * for(int i=1;i<=rows;i++){ for(int j=rows;j>=i;j--){ System.out.print(j+" ");
		 * } System.out.println(); } for(int i=rows;i>=1;i--){ for(int j=rows;j>=i;j--){
		 * System.out.print(j+" "); } System.out.println(); }
		 */
        for (int i = 1; i<= rows; i++) 
        {
            //Printing first half of the row
             
            for (int j = 1; j<= i; j++) 
            { 
                System.out.print(j+" "); 
            }
             
            //Printing second half of the row 
             
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
	}

}
