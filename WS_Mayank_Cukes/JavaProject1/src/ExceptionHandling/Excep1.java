package ExceptionHandling;

import java.util.Scanner;

public class Excep1 {

	public static void main(String[] args) {
		String s=null;
		int a,b,c,i;
		int ar[]={1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend");
		a=sc.nextInt();
		System.out.println("Enert divisor");
		b=sc.nextInt();
		System.out.println("Enter an index from 0-4");
		
		i=sc.nextInt();
        try{
        c=a/b;
		System.out.println("division value :"+c);
		System.out.println(ar[i]);
		System.out.println("Done");
		System.out.println(s.length());
        }
        catch(ArithmeticException e){
        	System.out.println(e);
        	System.out.println("Divisor can not be zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
        	System.out.println(e);
        	System.out.println("incorrect index");
        }
        catch(Exception e){
        	System.out.println(e);
        	System.out.println(e +"can not catch block");
        }
        System.out.println("Rest of code...");
	}

}
