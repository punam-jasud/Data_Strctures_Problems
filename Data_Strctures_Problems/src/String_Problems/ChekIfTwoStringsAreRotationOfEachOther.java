package String_Problems;

public class ChekIfTwoStringsAreRotationOfEachOther {

	public static void main(String[] args) {
	
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "StrutsHibernateJavaJ2ee";
		
		checkIfRotation(s1,s2);
		
	}

	private static void checkIfRotation(String s1, String s2) {
		
		//step 1
		if(s1.length() != s2.length())
		{
			System.out.println("s2 is not rotated version of s1");
		}
		else
		{
			//step 2
			String s3 = s1 + s2;
			
			if(s3.contains(s2))
			{
				System.out.println("s2 is rotated version of s1");
			}
			else
			{
				System.out.println("s2 is not rotated version of s1");
			}
		}
		
	}

}
