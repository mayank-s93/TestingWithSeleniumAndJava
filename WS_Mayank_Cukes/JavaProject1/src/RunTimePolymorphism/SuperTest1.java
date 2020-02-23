package RunTimePolymorphism;


class vehical{
	int speed=80;
}
class bike extends vehical{
	int speed = 100;
	void show(){
		System.out.println("Normal vehical speed :"+super.speed);
		System.out.println("Bike's speed :"+speed);
	}
}
public class SuperTest1 {

	public static void main(String[] args) {
		bike b=new bike();
		b.show();

	}

}
