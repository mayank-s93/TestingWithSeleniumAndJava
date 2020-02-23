package Collectionsk;

import java.util.ArrayList;

public class CollectionMethodsInItr {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
		ArrayList<String> al2=new ArrayList<String>();
		al1.add("abc");
		al1.add("pqr");
		al1.add("xyz");
		al2.add("A");
		al2.add("B");
		al2.add("C");
		System.out.println("Initial al1 :"+al1);  //collection interface methods
		System.out.println("Initial al2 :"+al2);
		System.out.println(al1.contains("pqr"));
		System.out.println(al1.containsAll(al2));;
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println(al1.containsAll(al2));
		System.out.println(al1.equals(al2));
		System.out.println(al1.size());
		System.out.println(al1.isEmpty());
		al1.clear();
		System.out.println(al1.isEmpty());
		
		
	}

}
