package FileHandlig;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ChrClaWrtTest {

	public static void main(String[] args) {
		try{
			FileWriter fw=new FileWriter(".txt");
			fw.write("Hello How are you");
			fw.close();
			System.out.println("File created");
		}
		catch(FileNotFoundException e){
			System.out.println("Folder not available");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
