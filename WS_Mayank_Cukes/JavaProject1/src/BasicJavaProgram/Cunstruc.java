package BasicJavaProgram;

public class Cunstruc {
	int rn;
	String name;
	public Cunstruc(int r,String n) 
	 {
		 rn=r;
		name=n;
	}
	 void show(){
			System.out.println("Roll no :"+rn);
			System.out.println("Name :"+name);
			
		}
	public static void main(String[] args) {
		
		Cunstruc c1=new Cunstruc(1,"xyz");
		c1.show();

	}

}
