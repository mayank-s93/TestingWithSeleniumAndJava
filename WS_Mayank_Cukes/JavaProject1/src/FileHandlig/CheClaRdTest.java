package FileHandlig;

import java.io.FileReader;
import java.io.IOException;

public class CheClaRdTest {

	public static void main(String[] args) {
		try{
			FileReader fin=new FileReader( "XoZ.txt");

			int i;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
				}
			fin.close();
			}
		catch(IOException e){
			System.out.println("File does not exist");
		}
		System.out.println("Rest of code..");
	}

}
