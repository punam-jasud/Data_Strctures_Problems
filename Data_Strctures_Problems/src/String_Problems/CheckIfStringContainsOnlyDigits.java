package String_Problems;

public class CheckIfStringContainsOnlyDigits {

	public static void main(String[] args) {
		
		String str  = "123";
		
		checkWithoutUsingRegEx(str);
		checkUsingRegEx(str);

	}

	private static void checkUsingRegEx(String str) {
		
		if(str.matches("[0-9]+"))
		{
			System.out.println("String contains only digits");
		}
		else
		{
			System.out.println("String contain other characters too");
		}
		
	}

	private static void checkWithoutUsingRegEx(String str) {
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			}
			else
			{
				break;
			}
		}
		if(count == str.length())
		{
			System.out.println("String contains only digits");
		}
		else
		{
			System.out.println("String not contain only digits");
		}
		
	}

}
