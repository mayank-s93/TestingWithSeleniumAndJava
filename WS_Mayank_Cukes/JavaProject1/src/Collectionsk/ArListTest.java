package Collectionsk;

import java.util.ArrayList;

public class ArListTest {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>(); //Generic define types , we can avoid type casting
		al.add("abc");
		al.add("pqr");
		al.add("abc"); // dup
		al.add("asd");
		al.add("123");
		
		//System.out.println(al);
		System.out.println("Name starting with ab only");
		for(String r:al){
			if(r.startsWith("ab"))
				System.out.println(r);
		}
	}

}
