package Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc  = new Scanner(System.in);
		System.out.println("How many ELements : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter Elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		
		System.out.println("Original Array With Duplicates : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		removeElements(a);
	}

	private static void removeElements(int a[]) {
	/*Java program to remove duplicates from this array.
	You don't need to physically delete duplicate elements, replacing with null, or  empty or default value is ok */
		
		//Sort Array to Bring Duplicates Together
		Arrays.sort(a);
		int result[] = new int[a.length];
		int previous = a[0];
		result[0] = previous;
		for (int i = 1; i < a.length; i++) {
			int ch = a[i];
			if(previous != ch)
			{
				result[i] = ch;
			}
			previous = ch;
			
			
		}
		System.out.println("\nOriginal Array After Removing Duplicates : ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
 	
	
		
	}

}
