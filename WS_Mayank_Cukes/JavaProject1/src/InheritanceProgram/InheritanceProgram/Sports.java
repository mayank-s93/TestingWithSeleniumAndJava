package InheritanceProgram;

public class Sports extends Marks {
	float k1;
	void inputScore(){
		input();
		inputMarks();
		System.out.println("Input 11 Score");
		k1=sc.nextFloat();
	
	}
	void showScore(){
		show();
		showMarks();
		System.out.println("Score in Sports :"+k1);
		
		
	}

	public static void main(String[] args) {
		
		Sports s=new Sports();
		s.inputScore();
		s.showScore();
		
	}
}
