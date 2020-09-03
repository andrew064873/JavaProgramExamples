import java.util.Scanner;
public class Project5_AndrewSkalickyAlanPugh 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);//Scanner is defined, as well as ints.
		int currentValue =0;
		int prevValue = 3;
		int numOne = 0;
		int numTwo = 0;
		int numThree = 0;
		int numFour = 0;
		int numFive = 0;
		int negChange =0;
		int posChange =0;
		int noChange =0;
		
		System.out.println("Enter the polling data or -1 to stop");
		currentValue = keyboard.nextInt();//priming read
		
		while (currentValue != -1){//sentinel controlled loop
			if (currentValue > prevValue){
				posChange++;
			}
			else if(currentValue < prevValue){
				negChange++;
			}
			else{
				noChange++;
			}
			if (currentValue == 1){
				numOne++;
			}
			else if (currentValue == 2){
				numTwo++;
			}
			else if (currentValue == 3){
				numThree++;
			}
			else if (currentValue == 4){
				numFour++;
			}
			else {
				numFive++;
			}
			prevValue = currentValue;//reference point for change
			System.out.println("Enter the polling data or -1 to stop");
			currentValue = keyboard.nextInt();
				
		}
		System.out.println("1 was chosen "+numOne+" times.");//prints for final data output
		System.out.println("2 was chosen "+numTwo+" times.");
		System.out.println("3 was chosen "+numThree+" times.");
		System.out.println("4 was chosen "+numFour+" times.");
		System.out.println("5 was chosen "+numFive+" times.");
		System.out.println("There were:");
		System.out.println(posChange+" Positive Changes");
		System.out.println(negChange+" Negative Changes");
		System.out.println(noChange+" No Changes");
	}

}
