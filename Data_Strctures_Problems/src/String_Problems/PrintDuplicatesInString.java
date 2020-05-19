package String_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicatesInString {

	public static void main(String[] args) {
		
		printDuplicateCharacters("Programming");
		printDuplicateCharacters("Combination");
		printDuplicateCharacters("java");
		printDuplicateCharacters("mmmmnn");
	}

	private static void printDuplicateCharacters(String str) {
	
		char characters[] = str.toCharArray();
		
		//Build a Map of Character - > count
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for(Character ch : characters)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch) + 1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
		//Iterate HashMap and Print Charcters Whose count > 1
		System.out.println("Duplicate characters  in " + str + " : ");
		
		Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
		
		for(Map.Entry<Character, Integer> entry : entrySet)
		{
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
		}
		
		
	}

}
