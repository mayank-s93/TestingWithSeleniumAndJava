package Strings;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		String s1="Hellow. How are you";
		String s2="Bad - Luck";
		String s3="  Bye - Bye  ";
		String s4= "Welcome";
		String s5="Hello";
		int  count = 0;
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s8=sc.nextLine();
		
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(6, 9));
		System.out.println(s4.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s2.replace("Bad", "Good"));
		System.out.println(s3.trim());
		System.out.println(s4.startsWith("We"));
		System.out.println(s4.endsWith("Bye"));
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('H'));
		System.out.println(s1.lastIndexOf('H'));
		//for(int i=0;i<s8.length();i++){
			///if(s8.charAt(i)=='s'){
			//	count++;	
			//}
		}
		//System.out.println(count);	
	}


