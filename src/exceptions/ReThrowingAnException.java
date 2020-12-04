package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReThrowingAnException {

	public static void main(String[] args) throws Throwable {


		try {
			FileInputStream fs = new FileInputStream("bhcdsvabvcdsavh");
		} catch (FileNotFoundException e) {
			
			System.out.println("File was not found. Please check the path.");
			
			System.out.println("The time is 16:09 PM.");
			
			throw e;   // re-throwing the same exception caught by the catch block
			
			
		}finally {
			throw new Throwable();
		}
		
		

	}

}