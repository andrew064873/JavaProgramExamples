import java.io.*;
import java.util.Scanner;

/** This project was inspired by word jumbles.  The program will randomly choose a word
 * from a dictionary, randomly arrange the letters and give the user three chances to guess 
 * the word.  If the user guesses correctly, they win, otherwise they lose.  The game is repeated
 * as many times as the user wishes.
 * 
 * @author Deborah A. Trytten
 * @version 1.0
 *
 */
public class Project9_AndrewSkalickyDuncanWright
{

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner keyboard = new Scanner(System.in);
		final String fileName = "dictionary.txt";
		
		String[] dictionary = readDictionary(fileName);// Find the number of words in the dictionary
		
		//Play this game repeatedly
		String repeatPlay="yes"; // Used at the end of the loop to determine if the game should be played again
				
		int wins = 0;
		int losses = 0;
		final int TRIES = 3; // the number of guesses a user is allowed
				
		while (repeatPlay.equalsIgnoreCase("yes")){
			int wordsInDictionary = dictionary.length;
			int randomCount = (int)(Math.random() * wordsInDictionary);
			
			String chosenWord = dictionary[randomCount];
					
			// mix up the letters randomly
			StringBuilder tempWord = new StringBuilder(chosenWord);
			StringBuilder scrambledTempWord = new StringBuilder();
			String scrambledWord = scrambleWord(tempWord, scrambledTempWord);
			// Give the  user 3 chances to guess the word
			int guesses = 0;
			boolean won = didWin(scrambledWord, TRIES, guesses, chosenWord);
			
		//If they didn't succeed, tell them the word, otherwise congratulate them
		if (won)
		{
			System.out.println("Congratulations!  You guessed the word correctly!");
			++wins;
		}
		else
		{
			System.out.println("I'm sorry but you lost.  The word was: " + chosenWord);
			++losses;
		}
		
		// Report the number of wins and losses
		System.out.println("You have won " + wins + " times.");
		System.out.println("You have lost " + losses + " times.");
	
		// Let them choose to play again
		System.out.println("Do you want to play again? Yes or no");
		repeatPlay = keyboard.nextLine();
		
		}
		
		
	}
	public static String[] readDictionary(String fileName) throws FileNotFoundException{
			
		int fileSize = 0;																 // it then saves this number into fileSize
		Scanner file = new Scanner(new File(fileName));
		while (file.hasNextLine()){
			
			fileSize=fileSize+1;
			file.nextLine();
		}
		int wordsInDictionary=0;
		String[] dictionary = new String[fileSize];
		// Open the file
		file = new Scanner(new File(fileName));

		// Read in words, one at a time from the file and put them into the array
		for (int i=0; i<fileSize && file.hasNextLine(); ++i){
			dictionary[i] = file.nextLine();
			++wordsInDictionary;
		}
		
		file.close();
		return dictionary;
	}		
		
	public static String scrambleWord(StringBuilder tempWord, StringBuilder scrambledTempWord){
			// Repeatedly choose a letter to remove from the current word, and put these randomly
			// chosen letters in order in a new word.  This uses the StringBuilder class, which is like String
			// but has different methods--including delete and append which are useful here
			// You do not need to understand this part of the code to use it!
			while (tempWord.length() > 0)
			{
				int letterNumber = (int) (Math.random()*tempWord.length());
				char nextLetter = tempWord.charAt(letterNumber);
				tempWord.deleteCharAt(letterNumber);
				scrambledTempWord.append(nextLetter);
			}
			String scrambledWord = scrambledTempWord.toString();
			return scrambledWord;
	}
			
	public static boolean didWin (String scrambledWord, int TRIES, int guesses, String chosenWord){
			String guessedWord="";  // keep the compiler happy
			Scanner keyboard = new Scanner(System.in);
			
			while (guesses < TRIES)
			{
				System.out.println("The scrambled word is " + scrambledWord);
				System.out.println("What is your guess?");
				guessedWord = keyboard.nextLine();
				guessedWord = guessedWord.toLowerCase();
				++guesses;
				if (guessedWord.equals(chosenWord))
					guesses = TRIES; // stop the loop
			}
			boolean won = (guessedWord.equals(chosenWord));
			return won;
	}
		
}


