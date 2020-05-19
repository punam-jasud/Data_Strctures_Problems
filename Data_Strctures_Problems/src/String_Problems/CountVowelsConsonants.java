package String_Problems;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		
		String str = "BeginnersBook";
		countVowelConsonants(str);

	}

	private static void countVowelConsonants(String str) {
		
		int vCount = 0;
		int cCount = 0;
		
		//convert all chars to lowercase
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vCount++;
			}
			else if(ch >= 'a' && ch <= 'z')
			{
				cCount++;
			}
			
		}
		System.out.println("Number of Vowels : " + vCount);
		System.out.println("Number of Consonants : " + cCount);
		
	}

}
