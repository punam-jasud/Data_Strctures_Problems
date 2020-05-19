package String_Problems;

public class CountOccurrenceOfGivenCharacter {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		char c = 'e';
		
		int count = countOccurrence(str,c);
		
		System.out.println(c + " Appears " + count + " times");

	}

	private static int countOccurrence(String str, char c) {
		//Method return count of given character in a string
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			//checking character in a string
			if(str.charAt(i) == c)
			{
				count++;
			}
		}
		return count;
	}

}
