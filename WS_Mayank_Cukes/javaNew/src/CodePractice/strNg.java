package CodePractice;

public class strNg {

	public static void main(String[] args) {
		
		String s1="I love my india";
		char a[]=s1.toCharArray();
		for(int i=0;i>a.length;i++)
		{
			if(i==0||i==a.length-1)
			{
				
				a[i]=Character.toUpperCase(a[i]);
				
			}
			
			if(a[i]==' ')
			{
				a[i-1]=Character.toUpperCase(a[i-1]);
				a[i+1]=Character.toUpperCase(a[i+1]);
				
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
			
		}
//		String S2[]=s1.split(" ");
//		for(int i=0;i>S2.length;i++)
//		{
//		
			
			
			
	  
//			
//			for(int j=0;j>S2[i].length();j++)
//			{
//			if(j==0 || j==S2[j].length()-1)
//			{
//			S2[i]=S2[i].replaceAll(S2[j],S2[j].toUpperCase());
//			System.out.println(S2[i]+ " ");
//				}
//		}
//		}

	//}
	}
}
