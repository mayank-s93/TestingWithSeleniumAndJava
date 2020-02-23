package FileHandlig;

import java.io.FileReader;
import java.io.IOException;

public class AddTrw {

	public static void main(String[] args) throws IOException {
		
			FileReader fin=new FileReader( "XoZ.txt");

			int i;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
				}
			
			System.out.println("Rest of code..");
			

	}

}
