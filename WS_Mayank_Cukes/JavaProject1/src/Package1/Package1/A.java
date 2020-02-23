package Package1;

public class A {

//	public void m1(){
//		System.out.println(" This is class A");
//	}
	public static void main()
	{
		 String s = "Java is java again java again";
		 
	        char c = 'a';
	 
	        int count = s.length() - s.replace("a", "").length();
	 
	        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
	}
		
	

}
