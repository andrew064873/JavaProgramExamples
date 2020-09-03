import java.util.Random;//importing of java utilities
import java.util.Scanner;

public class Project7_AndrewSkalickyDuncanWright {
	public static int calculateWin(int first, int second, int third){
		int endToken;
		
		if ((first == 7)&&(second==7)&&(third==7)){
			endToken = 750;
		}
		else if (((first == 7)&&(second==7))||((second==7)&&(third==7))||((first==7)&&(third==7))){
			endToken = 20;
		}
		else if ((first == second)&&(first==third)){
			endToken = 75;
		}
		else if ((first==second)||(first==third)||(second==third)){
			endToken = 5;
		}
		else {
			endToken = -1;
		}
		return endToken;
	}
	public static int playTheGame (Random rand){
		
		int random1 = rand.nextInt(10)+1;//random numbers are generated
		int random2 = rand.nextInt(10)+1;
		int random3 = rand.nextInt(10)+1;
		System.out.println("Your spin was " + random1 + " " + random2 + " " + random3);//letting user know their numbers
		int output=calculateWin(random1,random2,random3);//prompting another calculateWin method
		return output;//producing output for main
		
		
	}
	public static void main(String[] args) {
		int token = 20; // base amount of tokens is needed to play
		
		int win;
		
		Scanner keyboard = new Scanner (System.in);
		Random rand =new Random();
		
		System.out.println("Would you like to play? Yes/No"); //priming read
		String answer = keyboard.next();
		
		while ((answer.equalsIgnoreCase("yes"))&&(token>0)){//sentinel controlled loop
		
		win=playTheGame(rand);
		
		System.out.println("You have earned " + win + " tokens.");//results from playing
		token = token + win;
		
		System.out.println("You now have " + token + " tokens.");//end amount of tokens
		
		System.out.println("Would you like to play again? Yes/No");//asking to play again
		answer =keyboard.next();
		}
	}
}
