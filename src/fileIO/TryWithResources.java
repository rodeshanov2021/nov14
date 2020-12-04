package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class TryWithResources {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\Users\\Duotech\\Desktop\\Duo\\furkan.txt");
		
			
		try ( PrintWriter pw = new PrintWriter(f); ){
			 // I created a new file and opened a connection to it
			pw.print("Hello ");
			
			pw.print(" World");
			
			pw.println();
			
			pw.println("This is another line");
			
			pw.println("This is the third line");
			
			pw.println("This is try-with-resources file");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}