package Part1;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Any yo yo Decimal Number :");
		//Accept input from keyboard
		int input_decimal_num = sc.nextInt();
		int bin_num = 0,rem,temp_input_decimal_num,i=1;
		temp_input_decimal_num = input_decimal_num;

		//Loop continues till temp_input_decimal_num to 0
		while(temp_input_decimal_num > 0){
			//Get remainder
			rem = temp_input_decimal_num%2;
			bin_num = bin_num+rem*i;
			temp_input_decimal_num = temp_input_decimal_num/2;
			i=i*10;
		}
		//Display Result 
		System.out.println("Conversion of decimal to octal is : " + bin_num);
		
	
}
	
	
}
