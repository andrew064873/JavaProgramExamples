import java.util.Random;

public class Project11_AndrewSkalickyDuncanWrightTammyPham {

	public static void main(String[] args) 
	{
		
		experimentWithString();
		
		experimentWithStringBuilder();
	}
	
	public static void experimentWithString()
	{
		
		// Declare a reference to a String object.  Do not construct the String here (2 points)
		String firstString;
		
		// Construct a String object that contains "ABCDE" using the new operator (1 point)
		String firstStringPt2 = new String ("ABCDE");
		
		// Construct a String object that contains "abcde" without using the new operator (1 point)
		String secondString = "abcde";
		
		// Print out the characters of a String object, one to a line, in reverse order	 (5 points)
		for (int i = secondString.length()-1; i>=0; --i){
			System.out.println(secondString.charAt(i));
		}
		
		// Append "ABC" to a String object containing "abc" without using the + operator (5 points)
		String thirdString = "abc";
		thirdString = thirdString.concat("ABC");
		
		// Remove the vowels from a String object containing "hello" without constructing a new object
		// (5 points)
		
		//impossible because Strings are immutable, 
		//you cannot change them without creating a new object
		
		// Change a String object containing "hello" so that it contains "hi world!" without constructing
		// a new object.
		// (5 points)
		
		//impossible because Strings are immutable, 
		//you cannot change them without creating a new object
		
		// Write a static method that randomly scrambles the letters in a String using pass by sharing
		// The signature should be: public static void scrambleShare(String word)
		// Use this method to scramble a String object that contains "ZYWXV" (10 points)

		//impossible because pass by sharing attempts to modify the original String, which is immutable
		
		// Write a static method that randomly scrambles the letters in a String using a returned value
		// The signature should be:  public static String scrambleReturn(String word)
		// Use this method to scramble a String object that contains "LMNOP" (10 points)
		
		String fourthString = "LMNOP";
		
		String scrambledString = scrambleReturn(fourthString);
		System.out.println(scrambledString);
		
	}
	
	public static void scrambleShare(String word)
	{
		
	}
	
	public static String scrambleReturn(String word)
	{
		String scrambleWord = "";
		Random randGen = new Random();
		
		for (int i=0; i < 5; ++i){
			int num = randGen.nextInt(word.length());
			scrambleWord += word.charAt(num);
			word = word.replace(word.charAt(num),' ');
			word = word.replace(" ", "");
			
		}
		return scrambleWord;
	}
	
	
	public static void experimentWithStringBuilder()
	{
		// Declare a reference to a StringBuilder object.  Do not construct the String here (3 points)
		StringBuilder firstBuilder;
		
		// Construct a StringBuilder object that contains "ABCDE" using the new operator (1 point)
		StringBuilder secondBuilder = new StringBuilder ("ABCDE");
		
		// Construct a StringBuilder object that contains "abcde" without using the new operator (2 points)
				
		//impossible, because it does not have the same shortcuts as String class
		
		// Print out the characters of a StringBuilder object containing "ABCDE", one to a line, in reverse order	
		// (5 points)
		
		StringBuilder thirdBuilder = new StringBuilder ("ABCDE");
		for (int i = thirdBuilder.length()-1; i>=0; --i){
			System.out.println(thirdBuilder.charAt(i));
		}
		
		
		// Append "ABC" to a StringBuilder object containing "abc" without using the + operator
		// (5 points)
		
		StringBuilder fourthBuilder = new StringBuilder ("abc");
		fourthBuilder = fourthBuilder.append("ABC");
		System.out.println(fourthBuilder);
		
		// Remove the vowels from a StringBuilder object containing "hello" without constructing a new object
		// (5 points)
		
		StringBuilder fifthBuilder = new StringBuilder ("hello");
		fifthBuilder = fifthBuilder.replace(1, 2, "");
		fifthBuilder = fifthBuilder.replace(3, 4, "");
		System.out.println(fifthBuilder);
		
		
		// Change a StringBuilder object containing "hello" so that it contains "hi world!" without constructing
		// a new object.
		// (5 points)
		StringBuilder sixthBuilder = new StringBuilder ("hello");
		sixthBuilder = sixthBuilder.replace(1, 6, "i world!");
		System.out.println(sixthBuilder);
		
		// Write a static method that randomly scrambles the letters in a StringBuilder using pass by sharing
		// The signature should be: public static void scrambleShare(StringBuilder word)
		// Use this method to scramble a StringBuilder object that contains "ZYWXV" (10 points)
		StringBuilder seventhBuilder = new StringBuilder ("ZYWXV");
		scrambleShare (seventhBuilder);
		
		// Write a static method that randomly scrambles the letters in a String using a returned value
		// The signature should be:  public static StringBuilder scrambleReturnBuilder(String word)
		// Use this method to scramble a StringBuilder object that contains "LMNOP" (10 points)
		String tooManyStrings = "LMNOP";
		StringBuilder eighthBuilder = scrambleReturnBuilder(tooManyStrings);
		System.out.println(eighthBuilder);
		
	}
	
	public static void scrambleShare(StringBuilder word)
	{
		Random randGen = new Random();
		for (int i = word.length();i >0;--i){
			int num = randGen.nextInt(i);
			char temp = word.charAt(num);
			word = word.replace((0+num), (1+num), "");
			word = word.append(temp);
			
		}
		
		System.out.println(word);
	}
	
	public static StringBuilder scrambleReturnBuilder(String word)
	{
		StringBuilder scrambleWord = new StringBuilder ("");
		Random randGen = new Random();
		
		for (int i=0; i < 5; ++i){
			int num = randGen.nextInt(word.length());
			scrambleWord = scrambleWord.append(word.charAt(num));
			word = word.replace(word.charAt(num),' ');
			word = word.replace(" ", "");
		}
		return scrambleWord;
	}
}
