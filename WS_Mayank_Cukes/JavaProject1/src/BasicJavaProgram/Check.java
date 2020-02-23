package BasicJavaProgram;

public class Check {

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
   StaVar.collagedisplay();

	}

}
