package String_Problems;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		
		reverseEachWordOfString("Punam Jalindar Jasud");

	}

	private static void reverseEachWordOfString(String string) {
		
		String words[] = string.split("\\s");
		String reverseString = " ";
		
		for (int i = words.length-1; i >=0 ; i--) {
				
			reverseString = reverseString + words[i] + " ";
		}
		
		System.out.println("Original String : " + string);
		System.out.println("Reversed String : " + reverseString);
	}

}
