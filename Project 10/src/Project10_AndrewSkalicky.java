import java.util.Scanner;
import java.util.Arrays;


public class Project10_AndrewSkalicky {
	
	public static int sorting (String first, String second){
		
		int comp = 0;
		comp = first.compareTo(second);
		int result = 0; 
		
		if (comp == 0){
			result = 0;
		}
		else if (comp < 0){
			result = -1;
		}
		else if (comp > 0){
			result = 1;
		}
		
		return result;
	}
	
	public static String[]sortArray(String[]needsSorting, int inNum){
		String temp = "";
		for (int i=1; i<needsSorting.length;++i){
			
			
			for (int k=1; k<needsSorting.length; ++k){
				
				if (needsSorting[k]!=null){
					int edit = needsSorting [i].compareTo(needsSorting[k]);
					
					if (edit == 0){
						System.out.println("That email address is already inserted");
						k=1000;
						i=1000;
					}
					else if (edit == 1){
						
					}
					else if (edit == -1){
						temp = needsSorting [i];
						needsSorting [i]= needsSorting [k];
						
						for (int j=1;j<needsSorting.length;++j){
							
							if (needsSorting[(i+j)] != null){
								
							}
							else {
								needsSorting [(i+j)] = temp;
							}	
						}
					}
				}
				else {
					needsSorting[i]=temp;
					k = 1000;
					i = 1000;
					System.out.println("Insertion successful");
				}
			}
		}
		return needsSorting;
		
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);

		System.out.println("1. Enter a new email address");
		System.out.println("2. Find an existing email address");
		System.out.println("3. Quit");
		System.out.println("What is your choice?");
		
		String [] emailAddresses = new String [1000];

		int userInput = keyboard.nextInt();
		
		if (userInput == 1){
			System.out.println("Enter the email address:");
			String addEmail = keyboard.next();
		    emailAddresses[0] = "aaaaaaaaaaaaaa";
		    
			int count = sorting(addEmail,emailAddresses[0]);
			
			emailAddresses = sortArray (emailAddresses, count);
			
			System.out.println("1. Enter a new email address");
			System.out.println("2. Find an existing email address");
			System.out.println("3. Quit");
			System.out.println("What is your choice?");
			
			for (int c =0; c< emailAddresses.length; ++c){
				userInput = keyboard.nextInt();
				
				if (userInput == 1){
					System.out.println("Enter the email address:");
					addEmail = keyboard.next();
					
					count = sorting(addEmail,emailAddresses[0]);
					
					emailAddresses = sortArray (emailAddresses, count);
				}
				else if (userInput ==2){
					
				}
				else if (userInput == 3){
					c = emailAddresses.length;
					System.out.println("Bye.");
				}
			}}
			

		
		else if (userInput == 2){
			
		}
		else if (userInput == 3){
			System.out.print("Bye.");
		}
	

}
	
}

