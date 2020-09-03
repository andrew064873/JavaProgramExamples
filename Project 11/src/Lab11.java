// Some of the parts below are impossible to do.  
// When you encounter them, say they are impossible and explain why.

public class Lab11
{

	public static void main(String[] args) 
	{
		experimentWithString();
		
		experimentWithStringBuilder();
	}
	
	public static void experimentWithString()
	{
		// Declare a reference to a String object.  Do not construct the String here (2 points)
		
		// Construct a String object that contains "ABCDE" using the new operator (1 point)
		
		// Construct a String object that contains "abcde" without using the new operator (1 point)
		
		// Print out the characters of a String object, one to a line, in reverse order	 (5 points)
		
		// Append "ABC" to a String object containing "abc" without using the + operator (5 points)
		
		// Remove the vowels from a String object containing "hello" without constructing a new object
		// (5 points)
		
		// Change a String object containing "hello" so that it contains "hi world!" without constructing
		// a new object.
		// (5 points)
		
		// Write a static method that randomly scrambles the letters in a String using pass by sharing
		// The signature should be: public static void scrambleShare(String word)
		// Use this method to scramble a String object that contains "ZYWXV" (10 points)
		
		// Write a static method that randomly scrambles the letters in a String using a returned value
		// The signature should be:  public static String scrambleReturn(String word)
		// Use this method to scramble a String object that contains "LMNOP" (10 points)

	}
	
	public static void scrambleShare(String word)
	{
		
	}
	
	public static String scrambleReturn(String word)
	{
		return null; // this keep the compiler quiet--you will need to edit it
	}
	
	
	public static void experimentWithStringBuilder()
	{
		// Declare a reference to a StringBuilder object.  Do not construct the String here (3 points)
		
		// Construct a StringBuilder object that contains "ABCDE" using the new operator (1 point)
		
		// Construct a StringBuilder object that contains "abcde" without using the new operator (2 points)
		
		// Print out the characters of a StringBuilder object containing "ABCDE", one to a line, in reverse order	
		// (5 points)
		
		// Append "ABC" to a StringBuilder object containing "abc" without using the + operator
		// (5 points)
		
		// Remove the vowels from a StringBuilder object containing "hello" without constructing a new object
		// (5 points)
		
		// Change a StringBuilder object containing "hello" so that it contains "hi world!" without constructing
		// a new object.
		// (5 points)
		
		// Write a static method that randomly scrambles the letters in a StringBuilder using pass by sharing
		// The signature should be: public static void scrambleShare(StringBuilder word)
		// Use this method to scramble a StringBuilder object that contains "ZYWXV" (10 points)
		
		// Write a static method that randomly scrambles the letters in a String using a returned value
		// The signature should be:  public static StringBuilder scrambleReturnBuilder(String word)
		// Use this method to scramble a StringBuilder object that contains "LMNOP" (10 points)
	}
	
	public static void scrambleShare(StringBuilder word)
	{
		
	}
	
	public static StringBuilder scrambleReturnBuilder(String word)
	{
		return null; // this keep the compiler quiet--you will need to edit it
	}
}
