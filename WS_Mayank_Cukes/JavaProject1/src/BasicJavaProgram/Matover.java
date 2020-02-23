package BasicJavaProgram;

public class Matover {

	void area(float r){
		float a;
		a=3.14f*r*r;
		System.out.println("Area of circle: " +a);
	}
	void area(float l, float b){
		float a;
		a=l*b;
		System.out.println("Area of square: " +a);
	}
	void area(float pt, float b,float n){
		float a;
		a=pt*b*n;
		System.out.println("Area of triangle: " +a);
	}
	
	
	public static void main(String[] args) {
		Matover m=new Matover();
		m.area(5.3f);
		m.area(2.1f,4.5f);
		m.area(2.1f,4.5f,5.4f);
	}

}
