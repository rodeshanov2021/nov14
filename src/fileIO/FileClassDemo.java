package fileIO;

import java.io.File;

public class FileClassDemo {

	public static void main(String[] args) {
		// UNIX ->  Linux OS, Mac OS  -> User/Duotech/Desktop/Duo/poem.txt

		File f = new File("C:\\Users\\Duotech\\Desktop\\Duo\\file.txt");  // absolute path
		
		File f2 = new File("projectFile.txt");  // relative path -> relative to current working directory 
		
		
		File f3 = new File("anotherFile.txt"); //
		
		//The File class is a wrapper class for the file name and its directory path. 
		
		File folder = new File("C:\\Users\\Duotech\\Desktop\\Duo");  // Creates a file object that represents a PATH to that folder
		
		
		
		System.out.println(f.exists());
		System.out.println(f2.exists());
		System.out.println(f3.exists());
		System.out.println(folder.exists());
		
		System.out.println(f.isDirectory());
		System.out.println(folder.isDirectory());
		
//		f.delete();
//		folder.delete();
		
//		System.out.println(f2.renameTo(f));
		
		

	}

}