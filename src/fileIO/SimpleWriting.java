package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SimpleWriting {

	public static void main(String[] args)  {


		File f = new File("C:\\Users\\Duotech\\Desktop\\Duo\\newFile.txt");
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(f); // I created a new file and opened a connection to it
			pw.print("Hello ");
			
			pw.print(" World");
			
			pw.println();
			
			pw.println("This is another line");
			
			pw.println("This is the third line");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
		
		
		
		
		
		
		

	}

}