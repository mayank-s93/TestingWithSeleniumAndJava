package BasicJavaProgram;

public class ThCun {

	int rn;
	String name;
	static  int count=1;
	ThCun(){
		System.out.println("xyz");
		rn=count++;
	}
	ThCun( String n){
		this();
		System.out.println("xyz");
		name=n;
	}
	void show(){
		System.out.println("Roll no :"+rn);
		System.out.println("Name :"+name);
		
	}
	
	public static void main(String[] args) {
		

	}

}
