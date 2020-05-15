package String_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		
		char c = using_linkedHashMap(str);
		System.out.println("First Non-Repeating Character : " + c);
		
		char ch = using_OnlyOne_pass(str);
		System.out.println("First Non-Repeating Character : " + ch);
		
		
		char ch1 = using_HashMap(str);
		System.out.println("First Non-Repeating Character : " + ch1);

	}

	private static char using_HashMap(String str) {
		//Using HashMap to find first non-repeated character from String
		HashMap<Character, Integer> map = new HashMap<>();
		//Build a table [Char -> count]
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c , map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		//since Hash map doesn't keep order , going through string again
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(map.get(c) == 1)
				return c;
		}
		throw new RuntimeException("Didn't Find Non Repeating Character");
		
	}

	private static char using_OnlyOne_pass(String str) {
		//Finds first non repeated character in a String in just one pass using set and list
		
		Set<Character> repeating = new HashSet<>();
		List<Character> nonRepeating = new ArrayList<>();
		for(int i = 0 ; i < str.length();i++)
		{
			char letter = str.charAt(i);
			if(repeating.contains(letter))
			{
				continue;
			}
			if(nonRepeating.contains(letter))
			{
				nonRepeating.remove((Character)letter);
				repeating.add(letter);
			}
			else
			{
				nonRepeating.add(letter);
			}
		}
		
		return nonRepeating.get(0);
	}

	private static char using_linkedHashMap(String str) {
		//Using LinkedHashMap to find first non repeated character of String
	
		Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
		
		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}
		for(Entry<Character, Integer> entry : counts.entrySet())
		{
			if(entry.getValue() == 1)
			{
				return entry.getKey();
			}
		}
		throw new RuntimeException("Didn't find any nonrepeating charcter");
	}

}
