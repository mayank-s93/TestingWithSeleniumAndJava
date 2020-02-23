package Collectionsk;

import java.util.ArrayList;
import java.util.Iterator;

public class IterTest {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>(); //Generic define types , we can avoid type casting
		al.add("abc");
		al.add("pqr");
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("asd");
		al.add("123");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
				{
			System.out.println(itr.next());
		}

	}

}
