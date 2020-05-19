package String_Problems;

import java.util.Arrays;

public class CheckIfStringsAreAnagram {

	public static void main(String[] args) {
		
		String s1 = "keep";
		String s2 = "peek";
		
		if(areAnagram(s1,s2))
		{
			System.out.println(s1 + " and " + s2 + " are anagrams of each other.");
		}
		else
		{
			System.out.println(s1 + " and " + s2 + " are not anagrams of each other.");
		}

	}

	private static boolean areAnagram(String str1, String str2) {
		
		char s1[] = str1.toCharArray();
		char s2[] = str2.toCharArray();
		
		//Get the lengths of two strings
		
		int n1 = s1.length;
		int n2 = s2.length;
		
		//If length of two strings is not same ,
		//then they cannot be anagram
		if(n1 != n2)
			return false;
		
		//Sort both strings
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		//Compare sorted strings
		for(int i = 0 ; i < n1 ; i++)
		{
			if(s1[i] != s2[i])
				return false;
		}
		
		return true;
	}

}
