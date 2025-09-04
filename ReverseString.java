package JavaReverseString; // project made in eclipse

public class ReverseString { // public class 'ReverseString' is made

	public static void main(String[] args) {// reads, runs and executes
		String name = "Emmanuel";// variable string name = Emmanuel
		String reverseName= "";// variable String name reverseName = ""; empty String to hold 
		// the reversed String
		
		System.out.println("Orginal Name: " + name);
		
	// for loop created, int i set as 0 and i takes less than the .length() individual numbers
	// of letter in the name, i=i+1 set to increment by 1
		
		for(int i = 0; i<name.length(); i=i+1) {
			
	// variable reverseName = name.charAt(i), in the 'reverseName' variable, the 'name' variable 
	//calls onto 'int i' which has the length the amount of letters in the word and set the word in 
	// reverse and put the reverse word back into variable 'reverseName'
			
		// variable reverseName = original String name calls onto 'charAt(i)' which takes the value
		//'.length();'the number of letters in the name 'Emmanuel' which is stored in variable 'Name'
		// + reverseName which will add the name in reverse back into variable reverseName
			reverseName = name.charAt(i) + reverseName;
			
			System.out.println("Reverse Name: " + reverseName); // Display text and reversed String
		}

	}
