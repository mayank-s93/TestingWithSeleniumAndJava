package CodePractice;

class Student8{  
	   String abc="This   is  java code" ;  
	     
	   
	 void display (){
		 
		 String afr=abc.replaceAll("\\s{2,}", " ");
		 
			 System.out.print(afr);
		 
		 } 
	 
	 
	 
	 
	  
	 public static void main(String args[]){  
	 Student8 s1 = new Student8();  
	  
	   
	 s1.display();  
	 
	 }  
	}  