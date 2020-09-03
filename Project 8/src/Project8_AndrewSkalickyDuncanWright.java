import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Project8_AndrewSkalickyDuncanWright {
	
	public static int findSizeOfDictionary(String fileName) throws FileNotFoundException{//method finds the number of words in the dictionary
		int fileSize = 0;																 // it then saves this number into fileSize
		Scanner file = new Scanner(new File(fileName));
		while (file.hasNextLine()){
			
			fileSize=fileSize+1;
			file.nextLine();
		}
		
		return fileSize;
	}
		
	public static String[] readFile(String fileName, int fileSize) throws FileNotFoundException{//method constructs an array using fileSize
		Scanner file = new Scanner(new File(fileName));											//it then creates an arrray with the name dictionary
		String[] dictionary = new String[fileSize];
		for (int i = 0; i<fileSize; ++i){
			dictionary[i] = file.nextLine();
		}
		return dictionary;
		
	}
	public static void spellCheck(String[]dictionary){//method performs the primary operation of figuring out if the word is spelled correctly
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word or QUIT to stop:");
		
		String userInput = keyboard.next();
		
	
		while (!(userInput.equalsIgnoreCase("QUIT"))){
			
					
			int x = Arrays.binarySearch(dictionary, userInput);//searches whether or not the word is in the directory, if not, it is spelled incorrectly
			if (x>=0){
				System.out.println("That word is spelled correctly");
			}
			else{
				System.out.println("That word is not spelled correctly");
			}
			
			
			System.out.println("Enter a word or QUIT to stop:");
			
			userInput = keyboard.next();
		
		}
	}
	public static void main(String[] args) throws FileNotFoundException {//main method that envokes the other methods
		String fileName = "Dictionary.txt";
		
		
		
			
			int size = findSizeOfDictionary(fileName);
			String[] listWords = readFile(fileName, size);//?
			spellCheck(listWords);
			
		}

	

}
