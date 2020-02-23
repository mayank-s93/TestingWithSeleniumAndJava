package Collectionsk;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
//		HashMap<Integer, String> hm=new  HashMap<Integer, String>();
//		hm.put(4, "A");
//		hm.put(2, "P");
//		hm.put(5, "Q");
//		hm.put(3, "P");//dup value
//		hm.put(4, "R");
//		hm.put(1, null);
//		hm.put(6, null);
//		hm.put( null,"B");
//		hm.put( null,"K");
//		System.out.println(hm); 
		LinkedHashMap<Integer, String> hm=new  LinkedHashMap<Integer, String>();
		hm.put(4, "A");
		hm.put(2, "S");
		hm.put(5, "Q");
		hm.put(3, "P");//dup value
		hm.put(9, "P");
		hm.put(1, null);
		hm.put(6, null);
		hm.put( null,"B");
		hm.put( null,"K");
		System.out.println(hm);
		/*TreeMap<Integer, String> hm=new  TreeMap<Integer, String>();
		hm.put(4, "A");
		hm.put(2, "P");
		hm.put(5, "Q");
		hm.put(3, "P");//dup value
		hm.put(4, "R");
		hm.put(1, null);
		hm.put(6, null);
		//hm.put( null,"B");
		System.out.println(hm);*/
		
		
	}

}
