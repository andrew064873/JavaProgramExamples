import java.util.Scanner;

/** This class runs a campaign for Donald Duck.
 * 
 * @author Deborah A. Trytten
 *
 */
public class Fall2016 {

	// These constants are used for a menu system
	private static final int ADD_DONOR = 1;
	private static final int DONATION = 2;
	private static final int SUM_DONATIONS = 3;
	private static final int SINGLE_DONOR_DETAILS = 4;
	private static final int QUIT = 5;
	
	public static void main(String[] args) 
	{
		Campaign candidate = new Campaign("Donald Duck");
		Scanner keyboard = new Scanner(System.in);
		
		int menuChoice = 0;
		while (menuChoice != QUIT)
		{
			menuChoice = menu(keyboard);
			
			if (menuChoice == ADD_DONOR)
				addDonor(keyboard, candidate);
			else if (menuChoice == DONATION)
				addDonation(keyboard, candidate);
			else if (menuChoice == SUM_DONATIONS)
				sumDonations(candidate);
			else if (menuChoice == SINGLE_DONOR_DETAILS)
				singleDonorDetails(keyboard, candidate);
			else if (menuChoice == QUIT)
				System.out.println("Goodbye");
			else
				System.out.println("Unanticipated case");
		}
		
	}

	private static final int menu(Scanner keyboard)
	{
		System.out.println("Enter your choice below");
		System.out.println(ADD_DONOR + ": add new donor");
		System.out.println(DONATION + ": make donation");
		System.out.println(SUM_DONATIONS + ": find total donations");
		System.out.println(SINGLE_DONOR_DETAILS + ": single donor details");
		System.out.println(QUIT + ": quit");
		
		int value = keyboard.nextInt();
		keyboard.nextLine();
		if (value < ADD_DONOR || value > QUIT)
		{
			System.out.println(value + " is not in the legal range. Please re-enter");
			return menu(keyboard); // this is a cool trick called recursion
		}
		else // it was legal
		{
			return value;
		}
	}
	private static void addDonor(Scanner keyboard, Campaign candidate)
	{
		System.out.println("Enter the name of the donor");
		String  name = keyboard.nextLine();
		candidate.addDonor(name);
	}
	
	private static void addDonation(Scanner keyboard, Campaign candidate)
	{
		//TODO Fill in this method
		System.out.println("Please enter the donor's name.");
		String donorsName = keyboard.next();
		System.out.println("Please enter the amount to be donated.");
		double donationAmount = keyboard.nextDouble();
		
		candidate.addDonation(donorsName, donationAmount);
	}
	
	private static void sumDonations(Campaign candidate)
	{
		System.out.println(candidate.getCandidateName() + " has $" + candidate.getAllDonations()
				+ " of donations");
	}
	
	private static void singleDonorDetails(Scanner keyboard, Campaign candidate)
	{
		//TODO Fill in this method
		System.out.println("Please enter the donor's name to enquire.");
		String donorsName = keyboard.next();
		System.out.println(candidate.getDonationList(donorsName));
	}
}
