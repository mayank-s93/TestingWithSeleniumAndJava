package CodePractice;

import java.util.HashMap;
import java.util.Set;

public class Countchar2 {

	static void duplicateCharCount(String inputString) {
		
		HashMap<Character, Integer>   charCount= new HashMap<Character, Integer>();
		
		char[] strArr= inputString.toCharArray();
		
		for (char c: strArr){
			if(charCount.containsKey(c)){
				charCount.put(c, charCount.get(c)+1);
			}
			else{
				charCount.put(c, 1);
			}
		}
		Set<Character>  keyChar= charCount.keySet();
		System.out.println("Duplicate Characters In "+inputString);
		for (Character  ch :keyChar){
			if(charCount.get(ch)>1){
				System.out.println(ch +":"+charCount.get(ch));
			}
		}
		

	}
	public static void main(String[] args) {
		
		  duplicateCharCount("JavaJ2EE");
		  
	       duplicateCharCount("Fresh Fish");
	 
	       duplicateCharCount("Better Butter");
		

	}
}
