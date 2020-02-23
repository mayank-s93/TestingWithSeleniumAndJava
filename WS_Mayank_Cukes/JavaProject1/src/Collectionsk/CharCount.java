package Collectionsk;

import java.util.Scanner;
import java.util.TreeMap;

public class CharCount {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Charector String");
		s=sc.next();
		TreeMap<Character, Integer> hm=new  TreeMap<Character, Integer>();
		char c[]=s.toCharArray();
		for(char r:c){
			if(hm.containsKey(r)){
				hm.put(r, hm.get(r)+1);
				
			}
			else{
				hm.put(r, 1);
			}
		}
    System.out.println(hm);
	}

}
