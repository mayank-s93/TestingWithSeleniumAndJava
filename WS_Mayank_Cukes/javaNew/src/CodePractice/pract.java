package CodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;


public class pract {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new  HashMap<Integer, String>();
		hm.put(4, "A");
		hm.put(2, "P");
		hm.put(5, "Q");
		hm.put(3, "P");//dup value
		hm.put(4, "R");
		hm.put(1, null);
		hm.put(6, null);
		hm.put( null,"B");
		hm.put( null,"K");
		System.out.println(hm); 
//		LinkedHashMap<Integer, String> hm=new  LinkedHashMap<Integer, String>();
//		hm.put(4, "A");
//		hm.put(2, "S");
//		hm.put(5, "Q");
//		hm.put(3, "P");//dup value
//		hm.put(9, "P");
//		hm.put(1, null);
//		hm.put(6, null);
//		hm.put( null,"B");
	//	System.out.println(hm);
//		TreeMap<Integer, String> hm1=new  TreeMap<Integer, String>();
//		hm1.put(4, "A");
//		hm1.put(2, "P");
//		hm1.put(5, "Q");
//		hm1.put(3, "P");//dup value
//		hm1.put(4, "R");
//		hm1.put(1, null);
//		hm1.put(6, null);
//		hm1.put( null,"B");
//		System.out.println(hm1);
		
//		int[] strArray = {1,2,5,6,8,3,2,4,5,6,7};
//		 
//        for (int i = 0; i < strArray.length-1; i++)
//        {
//            for (int j = i+1; j < strArray.length; j++)
//            {
//                if( strArray[i]==strArray[j] && (i != j) )
//                {
//                    System.out.println("Duplicate Element is : "+strArray[j]);
//                    strArray = Arrays.remove(strArray, j);
//                }
//            }
//        }

	}

}
