package Part1;

public class Test {

	public static void main(String[] args) {
		 
		String s= "He is going office again and again and again without pay";
				String[] words= s.split(" ");
		
		/*
		 * for(int i=0; i<word.length;i++) { int count=1; for(int
		 * j=i+1;j<word.length;j++ ) { if(word[i].equalsIgnoreCase(word[j])) { count++;
		 * word[j]="0";
		 * 
		 * } } if(count > 1 && word[i] != "0") System.out.println(word[i]+" = "+count);
		 * }
		 */
					
				for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
				{
					if(words[i]!=null)
					{
					
					for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
					{
						
					if(words[i].equals(words[j]))	//Checking for both strings are equal
						{
							words[j]=null;			//Delete the duplicate words
						}
					}
					}
				}
				for(int k=0;k<words.length;k++)		//Displaying the String without duplicate words	
				{
					if(words[k]!=null)
					{
						System.out.print(words[k]+" ");
					}
					
			     }  
	}
}
