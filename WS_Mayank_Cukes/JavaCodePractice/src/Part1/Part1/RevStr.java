package Part1;

import java.util.Scanner;

public class RevStr {

	public static void main(String[] args) {
   
		String rev = "";
		

		Scanner sc=new Scanner(System.in);
		String s8=sc.nextLine();
		
		for(int i=s8.length()-1;i>=0;i--){
			rev= rev+s8.charAt(i);
		}
    System.out.println("Revers string is -->"+rev);
	}

}
