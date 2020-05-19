package String_Problems;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		
		//Original String
		String str = "punam jalindar jasud";
		System.out.println("Original String : " + str);
		
		//1. Reverse a string using stringBuffer
		String reverseStr = new StringBuffer(str).reverse().toString();
		System.out.println("Revrse a String Using StringBuffer : " + reverseStr);

		//Iterative Method to Reverse a String in Java
		reverseStr = reverse(str);
		System.out.println("Revrse a String Using Iteration : " + reverseStr);

		//Recursive Method to Reverse String
		reverseStr = reverseRecursively(str);
		System.out.println("Revrse a String Using Recursion : " + reverseStr);
		
	}

	private static String reverseRecursively(String str) {
		
		//base case to handle one char string and empty string
		if(str.length() < 2)
		{
			return str;
		}
		return reverseRecursively(str.substring(1)) + str.charAt(0);
		
	}

	private static String reverse(String str) {
		
		StringBuilder strBuilder = new StringBuilder();
		
		//Convert string into array
		char strChar [] = str.toCharArray();
		for(int i = strChar.length - 1 ; i >= 0 ; i--)
		{
			strBuilder.append(strChar[i]);
		}
		
		
		return strBuilder.toString();
	}

}
