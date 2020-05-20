package String_Problems;

public class CheckIfStringIsPalindrome {

	public static void main(String[] args) {
		
		String str = "peep";
		
		//Iterative Approach
		if(checkUsingIteration(str))
		{
			System.out.println(str + " is palindrome");
		}
		else
		{
			System.out.println(str + " is not palindrome");
		}
		
		//Recursive Approach
		if(checkUsingRecursion(str,0,str.length()-1))
		{
			System.out.println(str + " is palindrome");
		}
		else
		{
			System.out.println(str + " is not palindrome");
		}

		

	}

	private static boolean checkUsingRecursion(String str, int low, int high) {
		
		//base case
		if(low >= high)
		{
			return true;
		}
		
		//return false if mismatch happens
		if(str.charAt(low) != str.charAt(high))
		{
			return false;
		}
		
		return checkUsingRecursion(str, low+1, high-1);
	}

	private static boolean checkUsingIteration(String str) {
		
		if(str == null || str.length() == 0)
			return false;
		
		for(int i = 0 , j = str.length() - 1 ; i < j ; i++ , j--)
		{
			if(str.charAt(i) != str.charAt(j))
				return false;
		}
		
		return true;
		
		
	}

}
