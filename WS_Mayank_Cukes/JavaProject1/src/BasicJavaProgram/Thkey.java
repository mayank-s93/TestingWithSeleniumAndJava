package BasicJavaProgram;

public class Thkey {

	int rn;
	String name;
	public Thkey(int rn,String name) 
	 {/*
		 this.rn
		this.name;*/
	}
	 void show(){
			System.out.println("Roll no :"+rn);
			System.out.println("Name :"+name);
			
		}
	public static void main(String[] args) {
		Cunstruc c=new Cunstruc(1,"abc");
		c.show();
		Cunstruc c1=new Cunstruc(1,"xyz");
		c1.show();

	}

}
