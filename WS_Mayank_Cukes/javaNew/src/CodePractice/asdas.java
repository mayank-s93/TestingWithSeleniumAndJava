package CodePractice;

import java.util.HashMap;
import java.util.Set;

public class asdas {

	public static void main(String[] args) {  
		/*String s="@#$%^&  FYBYYasss10";
		int i,l,c1=0,c2=0,c3=0,sp=0, c4 = 0;
		char ch;
		l=s.length();
		for(i=0;i<l;i++)
		{
		ch=s.charAt(i);
		if(Character.isLowerCase(ch))
		++c4;
		else if(Character.isDigit(ch))
		++c2;
		else if(Character.isLetter(ch))
			++c1;
		else if(ch==' ')
		++sp;
		else
		++c3;
		}
		System.out.println("no of Letter="+c1);
		System.out.println("no of Digit="+c2);
		System.out.println("no of Spaces="+sp);
		System.out.println("no of Symbol="+c3);
		System.out.println("no of lower letter="+c4);
	       */
		
		String text = "This - text 35454534534! has \\4549879797 /allot # of % special % characters";
		text = text.replaceAll("[^0-9]", "");
		System.out.println(text);
		HashMap<Character,Integer> intCount=new HashMap<Character,Integer>();
		char[] ch=text.toCharArray(); 
		for(char c: ch){
			if (intCount.containsKey(c)){
				intCount.put(c, intCount.get(c)+1);
			}
			else
			{
				intCount.put(c, 1);
			}
		}
		Set<Character> uniqueNum=intCount.keySet();
		for (Character m : uniqueNum){
			if (intCount.get(m)>=1){
				System.out.println(m +" : "+intCount.get(m));
			}
			
		}
	}

}
