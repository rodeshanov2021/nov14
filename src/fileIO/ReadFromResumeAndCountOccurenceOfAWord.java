package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromResumeAndCountOccurenceOfAWord {

	public static void main(String[] args) throws FileNotFoundException {


		//Read from a txt file and count the ocuurence of a word
		
		String word = "Experience";
		
		int count = 0;
		
		
		File f = new File("resume.txt");
		
		
		Scanner sc = new Scanner(f);
		
		while(sc.hasNext()) {
			if(sc.next().equalsIgnoreCase(word)) {
				count++;
			}
			
			
		}
		
		System.out.println(count);
		
		sc.close();

	}

}