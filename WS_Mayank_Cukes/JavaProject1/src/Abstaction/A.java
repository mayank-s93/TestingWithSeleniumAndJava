package Abstaction;

abstract public class A {
	A(){
		System.out.println("A constructor");
	}
	void m1(){
		System.out.println(" A M1");
	}
	abstract void m2();
	static void m3(){
		System.out.println(" b M3");
	}
	public static void main(String[] args) {
		
		m3();

		}

}
