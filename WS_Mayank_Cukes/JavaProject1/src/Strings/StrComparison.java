package Strings;

public class StrComparison {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello");
		String s3="Hello";
		String s4="HELLO";
		String s5="Welcome";
		System.out.println(s1.equals(s2)); //true becoz value are same
		System.out.println(s1.equals(s4)); //false becoz value are diffrent
		System.out.println(s1.equalsIgnoreCase(s4));//true becoz value are same
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s5)); //Diffrence of ASCII Value of 1st diffrent charector
		System.out.println(s5.compareTo(s1));
	}

}
