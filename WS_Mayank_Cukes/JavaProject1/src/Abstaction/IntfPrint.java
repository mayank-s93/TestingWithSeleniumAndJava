package Abstaction;

public class IntfPrint implements Printable, Showable {

	public void print(){
		System.out.println("Hello is printed :"+Printable.data);
	}
	public void show(){
		System.out.println("Hello is Shwoing :"+Showable.data);
	}
	public static void main(String[] args) {
		
IntfPrint i=new IntfPrint();
i.print();
i.show();
//System.out.println("Hello is printed in final :"+data);
	}

}
