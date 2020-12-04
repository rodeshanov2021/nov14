/**
 * package exceptions;

public class FinalVsFinallyVsFinalize {

	public static void main(String[] args) {
		
		
		
		//final - classes -> cannot be extended, methods -> cannot be overridden, variables -> cannot be reassigned a different value
		//finally - optional block that is executed no matter the exception in try block is thrown or not (except System.exit())
		//finalize() - protected method that comes from Object class that is inherited by every Java object. 
		//The purpose is to do clean-up actions on that object before it gets garbage collected
	}

}
 */

package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatch {

	public static void main(String[] args) {
		
		
		try {
			
			System.out.println(9/0);
			int[] arr = new int[] {1,2};
			System.out.println();
		
		// Order of exception types matter only if the exceptions are related in hierarchy	 
		}
		catch (Error e) {
			System.out.println("error");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.out.println("Arithemtic Exception");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds");
		}
		
		
//		try {
//			System.out.println(9/0);
//			int[] arr = new int[] {1,2};
//			System.out.println();
//			FileInputStream fs = new FileInputStream("bhcdsvabvcdsavh");
//			
//		
//			// Starting from Java 7	
//		}catch (StringIndexOutOfBoundsException  | ArithmeticException | ArrayIndexOutOfBoundsException  | FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		
//		try {
//			System.out.println(9/0);
//			int[] arr = new int[] {1,2};
//			System.out.println();
//											// more specific (subclass type) needs to come first
//		}catch(ArithmeticException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}catch (RuntimeException e) {
//			System.out.println("Arithemtic Exception");
//		}catch (Exception e) {
//			System.out.println("Array index out of bounds");
//		}catch (Error e) {
//			System.out.println("Array index out of bounds");
//		}
//		catch (Throwable e) {
//			System.out.println("Filenot found");
//		}
		
		

	}

}