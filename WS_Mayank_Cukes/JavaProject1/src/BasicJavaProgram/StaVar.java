package BasicJavaProgram;

import java.util.Scanner;

public class StaVar {
	int r;
	String name;
	static String add ="Gomti Nagar, Lucknow";  
	static String college ="CMS";       //Initialize at class load, it is calso class variable.
	Scanner sc=new Scanner(System.in);
void input(){
	System.out.println("Input Roll no. And Name of Student");
	r=sc.nextInt();
	name=sc.next();
}
void show(){
	System.out.println("Roll no :"+r);
	System.out.println("Name :"+name);
	//System.out.println("College :"+college);
}
static void collagedisplay(){
	System.out.println("Collage :"+college);
	System.out.println("Collage Address :"+add);
}
	public static void main(String[] args) {
		StaVar s1=new StaVar();
		StaVar s2=new StaVar();
   System.out.println("Enter details of student 1");
   s1.input();
   System.out.println("Enter details of student 2");
   s2.input();
   System.out.println("Show details of student 1");
   s1.show();
   System.out.println("Show details of student 2");
   s2.show();
   System.out.println("College Details :" );
   collagedisplay();
	}

}
