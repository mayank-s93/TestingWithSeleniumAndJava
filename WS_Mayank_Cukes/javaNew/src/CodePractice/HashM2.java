package CodePractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashM2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm2=new  HashMap<Integer, String>();
		hm2.put(4, "A");
		hm2.put(2, "P");
		hm2.put(5, "Q");
		hm2.put(3, "P");//dup value
		hm2.put(4, "R");
		hm2.put(1, null);
		hm2.put(6, null);
		hm2.put( null,"B");
		hm2.put( null,"K");
		System.out.println(hm2); 
		LinkedHashMap<Integer, String> hm=new  LinkedHashMap<Integer, String>();
		hm.put(4, "A");
		hm.put(2, "S");
		hm.put(5, "Q");
		hm.put(3, "P");//dup value
		hm.put(4, "P");
		hm.put(1, null);
		hm.put(6, null);
		hm.put( null,"B");
		hm.put( null,"K");
		System.out.println(hm);
		TreeMap<Integer, String> hm1=new  TreeMap<Integer, String>();
		hm1.put(4, "A");
		hm1.put(2, "P");
		hm1.put(5, "Q");
		hm1.put(3, "P");//dup value
		hm1.put(3, "R");
		hm1.put(1, null);
		hm1.put(6, null);
		//hm1.put( null,"B");
		//hm1.put( null,"K");
		System.out.println(hm1);
		
		HashSet<String> hs=new  HashSet<String>();
		hs.add("A");
		hs.add( "P");
		hs.add( "Q");
		hs.add( "P");//dup value
		hs.add( "R");
		hs.add( null);
		hs.add( null);
		//hm1.put( null,"B");
		//hm1.put( null,"K");
		System.out.println(hs);
		
		TreeSet<String> ts=new  TreeSet<String>();
		ts.add("A");
		ts.add( "P");
		ts.add( "Q");
		ts.add( "P");//dup value
		ts.add( "R");
		//ts.add( null);
		//ts.add( null);
		//hm1.put( null,"B");
		//hm1.put( null,"K");
		System.out.println(ts);
		
		 Hashtable<Integer,String> th=new Hashtable<Integer,String>();  
		  
		 th.put(4, "A");
		 th.put(2, "P");
		 th.put(5, "Q");
		 th.put(3, "P");//dup value
		 th.put(3, "R");
		// th.put(1, null);
		// th.put(6, null);
		// th.put( null,"B");
		// th.put( null,"K");
			System.out.println(th);
	}
}
