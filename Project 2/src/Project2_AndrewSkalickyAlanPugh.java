// This code was created by Andrew Skalicky and Alan Pugh
public class Project2_AndrewSkalickyAlanPugh 
{

	public static void main(String[] args) 
	{
	//Declare the number of copies of each book we will be buying
	int eragonCopies = 3;
	int sorcerersStoneCopies = 1;
	int lightningThiefCopies = 5;
	
	//Recording the price of each book after checking Amazon
	double eragonPrice = 10.00;
	double sorcerersStonePrice = 10.00;
	double lightningThiefPrice = 7.99;
	final double TAX_RATE = .065;
	
	//Determine the price for total number of copies
	double eragonTotalPrice = (eragonCopies * eragonPrice);
	double sorcerersStoneTotalPrice = (sorcerersStonePrice * sorcerersStoneCopies);
	double lightningThiefTotalPrice = (lightningThiefCopies * lightningThiefPrice);
	
	//Output to the console
	System.out.println("Buying " + eragonCopies + " copies of Eragon at " + eragonPrice + " dollars per book. \n Total Price is " + eragonTotalPrice + " dollars.");
	System.out.println("Buying " + sorcerersStoneCopies + " copy of the Sorcerer's Stone at " + sorcerersStonePrice + " dollars per book. \n Total Price is " + sorcerersStoneTotalPrice + " dollars.");
	System.out.println("Buying " + lightningThiefCopies + " copies of the Lightning Thief at " + lightningThiefPrice + " dollars per book. \n Total Price is " + lightningThiefTotalPrice + " dollars.");
	
	//Determine the total cost of all the books, the sales tax, and the total cost of the order
	double totalCostWithoutTax = (eragonTotalPrice + sorcerersStoneTotalPrice + lightningThiefTotalPrice);
	double salesTax = (TAX_RATE * totalCostWithoutTax);
	double orderTotal = (totalCostWithoutTax + salesTax);
	
	//Output the total cost, sales tax, and total order cost
	System.out.println("The total cost of your purchase is " + totalCostWithoutTax + " dollars.");
	System.out.println("Sales tax is " + salesTax + " dollars.");
	System.out.println("The total cost of your order will be " + orderTotal + " dollars.");
			
	}

}
