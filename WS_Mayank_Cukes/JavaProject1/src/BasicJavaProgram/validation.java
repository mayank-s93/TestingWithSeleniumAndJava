package BasicJavaProgram;

import java.util.Scanner;

public class validation {
 void choice(){
	 float a,b,add,sub,mul,div;
	 int k;
	 System.out.println("Enter two number");
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
	 b=sc.nextInt();
	 System.out.println("1.Add" +"\n 2.Sub"+ "\n 3.Div"+ "\n 4.Mul");
	/* System.out.println("2.Sub");
	 System.out.println("3.Division");
	 System.out.println("4.Multiplication");
	 System.out.println("Enter your choice"); */
	 Scanner ch=new Scanner(System.in);
	 k=ch.nextInt();
	 
/*	 if (k==1){
		 add= a+b;
		 System.out.println("Additon is :"+add);
	 }
	 else if(k==2){
		 sub=a-b;
		 System.out.println("Substraction is :"+sub);}
	 else if(k==3){
		 div=a/b;
		 System.out.println("DVivision is :"+div);
	 }
	 else
	 {
		 mul=a*b;
		 System.out.println("Multiplication is :"+mul);
	 } */
	 
	 switch(k){
		 case 1:
			 add= a+b;
		 System.out.println("Additon is :"+add);
		 break;
		 case 2:
			 sub=a-b;
		 System.out.println("Substraction is :"+sub);
			 break;
			 case 3:
			 div=a/b;
			 System.out.println("DVivision is :"+div);
			 break;
			 case 4:
				 mul=a*b;
				 System.out.println("Multiplication is :"+mul);
				 break;
				 default:
					 System.out.println("Invalid Option");
				 
		
		 
	 }
	 
	 }
	 
	 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
validation v=new validation();
v.choice();
	}

}
