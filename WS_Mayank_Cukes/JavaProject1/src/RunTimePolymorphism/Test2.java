package RunTimePolymorphism;

import java.util.Scanner;

public class Test2 {

	int c;
	
	shape create(){
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		if(c==1){
			circle c=new circle();
			return c;
		}
		else if(c==2){
			rectangle r=new rectangle();
			return r;
		}
		else if(c==3){
			triangle t=new triangle();
			return t;
		}
		else{
			return new shape();   //anoynymos object
		}
	}
	public static void main(String[] args) {
		Test2 k=new Test2();
		shape s=k.create();
		s.draw();
		

	}

}
