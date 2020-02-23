package Collectionsk;

public class CmdLnArg {

	public static void main(String[] args) {
		int sum=0;
		for(String r:args){
			sum =sum +Integer.parseInt(r);
		}
 System.out.println("Sum :"+sum);
	}

}
