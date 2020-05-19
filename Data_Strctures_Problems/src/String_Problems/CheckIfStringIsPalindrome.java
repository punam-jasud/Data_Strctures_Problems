package String_Problems;

public class CheckIfStringIsPalindrome {

	public static void main(String[] args) {
		
		String str = "peep";
		if(checkUsingIteration(str))
		{
			System.out.println(str + " is palindrome");
		}
		else
		{
			System.out.println(str + " is not palindrome");
		}
		

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
