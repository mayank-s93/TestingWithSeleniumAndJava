package FileHandlig;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutTest {

	public static void main(String[] args) {
		try{
		FileOutputStream fout=new FileOutputStream( "Abc.txt");

		
			String s="Welcome to JAva";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("File Created");
		}
		catch(FileNotFoundException e){
			System.out.println("Folder not available");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
