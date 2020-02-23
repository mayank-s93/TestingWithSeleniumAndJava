package FileHandlig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInpTest {

	public static void main(String[] args) {
		try{
			FileInputStream fin=new FileInputStream( "Abc.txt");

			int i;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
				}
			fin.close();
			}
		catch(IOException e){
			System.out.println("File does not exist");
		}
	}

}
