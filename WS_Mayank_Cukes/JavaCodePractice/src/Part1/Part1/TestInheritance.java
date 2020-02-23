package Part1;

class Animal{  
void eat(){
	int i=56;
	int j=90;
	System.out.println(Integer.toString(i)+j);
	System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cow extends Dog{  
void abc(){System.out.println("cow class...");}  
}  
class TestInheritance extends Cow{  
public static void main(String args[]){  
	TestInheritance d=new TestInheritance();  
d.abc();  
d.eat();  
}}  
