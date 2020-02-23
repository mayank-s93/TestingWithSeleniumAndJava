package Collectionsk;

import java.util.ArrayList;
import java.util.Iterator;

public class ItrRemove {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>(); //Generic define types , we can avoid type casting
		al.add("abc");
		al.add("pqr");
		al.add("abc");
		al.add("AbC");
		al.add("abc");
		al.add("asd");
		al.add("123");
		
		Iterator<String> itr2=al.iterator();
		System.out.println("Remove all abc");
		while(itr2.hasNext()){
			if(itr2.next().equalsIgnoreCase("abc")){
				itr2.remove();
			}
			
		}
		System.out.println(al);
		}


	}


