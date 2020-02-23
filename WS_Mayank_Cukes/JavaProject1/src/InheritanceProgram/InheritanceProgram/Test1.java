package InheritanceProgram;



class Bank{
	int getIntrest(){
		return 0;
	}
}
	class Axis extends Bank{
		int getIntrest(){
			return 5;
		}
	}
	class SBI extends Bank{
		int getIntrest(){
			return 7;
		}
	}
	class ICICI extends Bank{
		int getIntrest(){
			return 10;
		}
	}


public class Test1 {

	public static void main(String[] args) {
		Axis a=new Axis();
		SBI s=new SBI();
		ICICI i=new ICICI();
		System.out.println("Intrest in Axix Bank is :"+a.getIntrest());
		System.out.println("Intrest in SBI Bank is :"+s.getIntrest());
		System.out.println("Intrest in ICICI Bank is :"+i.getIntrest());

	}

}
