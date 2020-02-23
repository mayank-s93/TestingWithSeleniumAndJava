package Collectionsk;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListMethods {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
		ArrayList<String> al2=new ArrayList<String>();
		al1.add("abc");
		al1.add("pqr");
		al1.add("xyz");
		al2.add("A");
		al2.add("B");
		al2.add("C");
		System.out.println("Initial al1 :"+al1);  //List interface methods
		System.out.println("Initial al2 :"+al2);
      al1.add(1,"ccc");
      System.out.println(al1);
      al1.addAll(2,al2);
      System.out.println(al1);
      System.out.println(al1.get(3));
      al1.set(3, "P");
      System.out.println(al1.get(3));
      al1.remove(1);
      System.out.println(al1);
      ListIterator<String> ltr=al1.listIterator();
      while(ltr.hasNext())
    	  System.out.println(ltr.next());
      System.out.println("Backward Direction");
      while(ltr.hasPrevious())
    	  System.out.println(ltr.previous());
	}
	

}
