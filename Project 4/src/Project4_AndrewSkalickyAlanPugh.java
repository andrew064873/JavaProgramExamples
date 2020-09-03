import java.util.Scanner; // import Scanner class
public class Project4_AndrewSkalickyAlanPugh {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);// create Scanner variable
		
		int score = 0;//create the variables to be used in this program
		String input;
		
		System.out.println("Please enter a yes or a no to all of these questions:");
		//let the user know what to do
		System.out.println("Do you feel trapped?");
		input = keyboard.next();//read answer to first question
		
		if (input.equalsIgnoreCase("yes")) {
			score = score+1;//add one to the score if the user said yes
		}
		System.out.println ("Do you feel tired most of the time?");
		input = keyboard.next();//read answer to second question
		
		if (input.equalsIgnoreCase ("yes")) {
			score = score+1;//add one to the score if the user said yes
		}
		System.out.println("Do you not seem to have much fun anymore?");
		input = keyboard.next();//read answer to third question
		
		if (input.equalsIgnoreCase("yes")) {
			score = score+1;//add one to the score if the user said yes
		}
		//output the potential of stress levels to user based on their score
		if (score == 0) {
			System.out.print("More exausted than stressed out.");
		}
		else if (score == 1){
			System.out.print("Beginning to stress out.");
		}
		else if (score == 2){
			System.out.print("Possibly stressed out.");
		}
		else {
			System.out.print ("Probably stressed out.");
		}
	}

}
