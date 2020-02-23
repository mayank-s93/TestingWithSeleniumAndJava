package RunTimePolymorphism;


class shape{
	void draw()
	{
		System.out.println("Draw Nothing");
	}
}
class circle extends shape{
	void draw()
	{
		System.out.println("Draw Circle");
	}
}
class rectangle extends shape{
	/*void draw()
	{
		System.out.println("Draw rectangle");
	}*/
}
class triangle extends shape{
	void draw()
	{
		System.out.println("ooooooo");
	}
}
public class Test1 {

	public static void main(String[] args) {
		shape s;         //Polymorphism becoz single s calling diffrent -2 mathod
		s=new shape();   
		s.draw();
		s=new circle();  //Type upcasting to achive run time polymorphism
		s.draw();
		s=new rectangle();
		s.draw();
		s=new triangle();
		s.draw();

	}

}
