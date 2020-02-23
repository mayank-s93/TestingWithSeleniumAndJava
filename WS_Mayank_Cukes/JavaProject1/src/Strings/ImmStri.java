package Strings;

public class ImmStri {

	public static void main(String[] args) {
	String s="Mayank";
	s=s.concat(" Srivastava");   //in literal class string is not modifiable. we need to change the reference
	System.out.println(s);

	}

}
