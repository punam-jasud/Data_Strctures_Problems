//Remove Duplicates from sorted array 
package Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesInPlaceSolution {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("How many ELements : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter Elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
 
		//1. Assuming array is sorted , Using temporary array
		n = remove_duplicates_using_temporary_array(a,n); //Time complexity - o(n) , Space Complexity - o(n)
		//Print Updated Array
		System.out.println("Remove Duplicates using Temporary Array : ");
		for(int i = 0 ;i < n;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		
		//2. Assuming array is sorted , using seperate index in the same array
		 n = remove_duplicates_using_seperate_index(a,n); //Time complexity - o(n) , space complexity - o(1)
		//Print Updated Array
			System.out.println("\nRemove Duplicates using Seperate index in the same Array : ");
			for(int i = 0 ;i < n;i++)
			{
				System.out.print(a[i] + " ");
			}
		
			//3. Assuming array is unsorted , So sort array first using Arrays.sort() Method
			
			//Sort Array first 
		
			Arrays.sort(a);
			 n = remove_duplicates_unsorted_array(a,n); //Time complexity - o(n) , space complexity - o(1)
			//Print Updated Array
				System.out.println("\nRemove Duplicates By sorting Unsorted Array using Sort Method : ");
				for(int i = 0 ;i < n;i++)
				{
					System.out.print(a[i] + " ");
				}
	}

	private static int remove_duplicates_unsorted_array(int[] a, int n) {
		// Function to remove duplicate elements 
	    // This function returns new size of modified 
	    // array.
		
		if(n == 0 || n == 1)
			return n;
		
		// To store index of next unique element 
		int j = 0;
		// Doing same as done in Method 1 
        // Just maintaining another updated index i.e. j
		for (int i = 0; i < n-1; i++) {
			if(a[i] != a[i+1])
				a[j++] = a[i];
		}
		a[j++] = a[n-1];
		
		return j;

	}

	private static int remove_duplicates_using_seperate_index(int[] a, int n) {
		// Function to remove duplicate elements 
	    // This function returns new size of modified 
	    // array.
		
		if(n == 0 || n == 1)
			return n;
		
		// To store index of next unique element 
		int j = 0;
		// Doing same as done in Method 1 
        // Just maintaining another updated index i.e. j
		for (int i = 0; i < n-1; i++) {
			if(a[i] != a[i+1])
				a[j++] = a[i];
		}
		a[j++] = a[n-1];
		
		return j;
	}

	private static int remove_duplicates_using_temporary_array(int[] a , int n) {
		//Return if array is empty or contains only one element
		if(n == 0 || n == 1)
			return n;
		
		int temp[] = new int[n];
		
		//start traversing elments
		int j = 0;
		for (int i = 0; i < n-1; i++) {
			//If current element is not equal to the next element
			//then store that current element
			if(a[i] != a[i+1])
			{
				temp[j++] = a[i];
			}
			
		}
			//store the last element as whether
			//it is unique or repeated , it hasn't stored previously
			temp[j++] = a[n-1];
			
			//Modify original array
			for(int i = 0 ; i < j ; i++)
			{
				a[i] = temp[i];
			}
		
		
		return j;
		
	}


}
