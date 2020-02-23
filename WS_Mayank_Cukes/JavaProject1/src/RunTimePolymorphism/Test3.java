package RunTimePolymorphism;

class vehical1{
	int speed=120;
	void show(){
		
		System.out.println("Default speed is "+speed);
	}
}
class bike1 extends vehical1{
	int speed = 100;
	void show(){
		System.out.println("Normal vehical speed :"+super.speed);
		System.out.println("Bike's speed :"+speed);
	}
	void display(){
		show();
		super.show();
	}
}
public class Test3 {

	public static void main(String[] args) {
		bike1 j1=new bike1();
		j1.display();

	}

}
