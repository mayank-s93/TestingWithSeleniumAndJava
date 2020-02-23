package Abstaction;

abstract class shape{
	abstract void draw();
}

class circle extends shape{
	void draw(){
		System.out.println("Dracwing circle");
	}
}
class rectangle extends shape{
	void draw(){
		System.out.println("Dracwing rectangle");
	}
}
abstract class triangle extends shape{
	
}
class upperTriangle extends triangle{
	void draw(){
		System.out.println("Dracwing Upper Triangle");
	}
}
class lowerTriangle extends triangle{
	void draw(){
		System.out.println("Dracwing Lower Triangle");
	}
}
public class Shape1 {

	public static void main(String[] args) {
	//	shape s=new shape();     error we can not create object of abstract class
		circle c=new circle();
		rectangle r=new rectangle();
		upperTriangle u=new upperTriangle();
		lowerTriangle l=new lowerTriangle();
				c.draw();
		r.draw();
		u.draw();
		l.draw();

	}

}
