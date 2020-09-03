import java.util.Scanner;
//importing the Scanner class

public class Project3_AndrewSkalickyAlanPugh {

	public static void main(String[] args) {
		final int CURRENT_YEAR = 2016;		//Creating all the constants we will be using in this program
		final int MAXIMUM_HEART_RATE = 220;
		final double MINIMUM_HEALTHY = .5;
		final double MAXIMUM_HEALTHY = .6;
		final double MAXIMUM_FITNESS = .7;
		final double MAXIMUM_AEROBIC = .8;
		final double MAXIMUM_ANAEROBIC = .9;
		
		
		Scanner keyboard = new Scanner(System.in);  //Creating the Scanner to be used
		
		System.out.println("Please enter your name:");//Reading and storing the users Name
		String name = keyboard.next();
		
		System.out.println("Please enter your year of birth:");  //Reading and storing the users Year of Birth
		int birthYear = keyboard.nextInt();
		
		keyboard.close (); //Closing the keyboard, as it will no longer be used
		
		int age = CURRENT_YEAR - birthYear; //Determining how old the user is
		int highestHeartRate = MAXIMUM_HEART_RATE - age; //Finding the user's maximum heart rate
		
		double lowHealthy = MINIMUM_HEALTHY * highestHeartRate /4; //Calculating the high and low values for each zone
		double highHealthy = MAXIMUM_HEALTHY * highestHeartRate /4;
		double highFitness = MAXIMUM_FITNESS * highestHeartRate /4;
		double highAerobic = MAXIMUM_AEROBIC * highestHeartRate /4;
		double highAnaerobic = MAXIMUM_ANAEROBIC * highestHeartRate /4;
		
		int roundedLowHealthy = (int)Math.round(lowHealthy); //Rounding the numbers
		int roundedHighHealthy = (int)Math.round(highHealthy);
		int roundedHighFitness = (int)Math.round(highFitness);
		int roundedHighAerobic = (int)Math.round(highAerobic);
		int roundedHighAnaerobic = (int)Math.round(highAnaerobic);
		int roundedFastestRate = (int)Math.round(highestHeartRate/4);
		
		System.out.println("Heart rate chart for: "+name);//Printing out the chart to the user
		System.out.println("Healthy Zone: \t"+roundedLowHealthy+"\t"+roundedHighHealthy);
		System.out.println("Fitness Zone: \t"+roundedHighHealthy+"\t"+roundedHighFitness);	
		System.out.println("Aerobic Zone: \t"+roundedHighFitness+"\t"+roundedHighAerobic);
		System.out.println("Anaerobic Zone: "+roundedHighAerobic+"\t"+roundedHighAnaerobic);
		System.out.println("Red-Line Zone: \t"+roundedHighAnaerobic+"\t"+roundedFastestRate);
	}

}
