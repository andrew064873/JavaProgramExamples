import java.util.ArrayList;

public class Donor 
{
	private String name;
	private ArrayList<Double> donations;
	
	public Donor(String name)
	{
		this.name = name;
		this.donations = new ArrayList<Double>();
	}

	public Donor (String name, double donation)
	{
		this(name);
		donations.add(donation);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getTotalDonations()
	{
		double sum = 0.0;
		for (int i=0; i<donations.size(); ++i)
		{
			sum += donations.get(i);
		}
		return sum;
	}
	
	public String toString()
	{
		String result = name + "\n";
		for(int i=0; i<donations.size(); ++i)
		{
			result += donations.get(i) + "\n"; // won't be pretty
		}
		
		return result;
	}
	
	public void addDonation(double donation)
	{
		donations.add(donation);
	}
}
