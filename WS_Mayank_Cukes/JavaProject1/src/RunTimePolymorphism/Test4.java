package RunTimePolymorphism;

class vehical2{
	
	vehical2(){
		
		System.out.println("Vehical is running");
	}
}
class bike2 extends vehical2{
	
	bike2(){
		//super();
		System.out.println("Bike is running :");
	}
	
}
public class Test4 {

	public static void main(String[] args) {
		bike2 b=new bike2();

	}

}
