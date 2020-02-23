package Part1;

import java.util.Scanner;

public class DupChar {

	public static void main(String[] args) {
		System.out.println("Input String ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch = s.toCharArray(); 
	
		for(int i=0;i<=s.length();i++){
			int count=0;
			int index=i;
			for(int j=i+1;j<s.length();j++){
				if(j<i&&ch[i]==ch[j]){
					break;
					
				}
				if(ch[index]==ch[j]){
					count++;
				}
				
			}
			if(count>1){
				System.out.println(ch[i]+" is "+count+" times present in string");
			}
		}

	}

}
