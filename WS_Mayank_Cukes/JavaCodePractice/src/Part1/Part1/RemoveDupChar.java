package Part1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDupChar {

	public static void main(String[] args) {
		String ar[]={"A","B","A","N","J","K","N","C","D",null,null};
		
		List<String> s=new LinkedList<String>();
		for(String k : ar){
			s.add(k);
		}
		String l=s.toString();
		System.out.println(l);

	}

}
