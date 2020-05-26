/* 
 * Java Program sort an integer array using counting sort algorithm. 
 * input: [60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40] 
 * output: [10, 20, 20, 30, 30, 30, 40, 40, 40, 40, 60, 60, 60] 
 * Time Complexity of Counting Sort Algorithm: 
 * Best Case O(n+k); Average Case O(n+k); Worst Case O(n+k),
 * where n is the size of the input array and k means the
 * values range from 0 to k.
 */

package AlgorithmsAndMiscellaneous;

import java.util.Arrays;

public class CountSort {

	public static void main(String[] args) {

		int a[] = {60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40};
		int k = 60; //Maximum number
		
		System.out.print("Array Before Sorting : ");
		System.out.println(Arrays.toString(a));
		
		//Sort using counting sorting algorithm
		countingSort(a,k);
		
		System.out.print("Array After Sorting : ");
		System.out.println(Arrays.toString(a));
	}

	private static void countingSort(int[] a, int k) {
		//Create Buckets to 0
		int count[] = new int[k+1];
		
		//step 1 : Initialize All elements of Count Array to 0 
		for(int i = 0 ; i <= k ; i++)
		{
			count[i] = 0;
		}
		//step 2 : store count of each element in count array
		for(int i = 0 ; i < a.length ; i++)
		{
			count[a[i]]++;
		}
		
		// Step 3 : Change count[i] so that count[i] now contains actual position of this element in output array
		for(int i = 1 ; i <= k ; i++)
		{
			count[i] = count[i] + count[i-1];
		}
		
		//Step 4 : Iterate over array and put element in correct sequence 
		//based on modified count array and reduce the count by 1
		int temp[] = new int[a.length];
		for(int i = 0 ; i < a.length ; i++)
		{
				temp[--count[a[i]]] = a[i];				
		}
		for (int i = 0; i < temp.length; i++) {
			a[i] = temp[i];
		}
	}

}
