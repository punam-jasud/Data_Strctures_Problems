package AlgorithmsAndMiscellaneous;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
	
		int a[] = {432, 8, 530, 90 , 88, 231, 011, 045, 677, 199};
		//int a[] = {90,23,101,45,65,23,67,89,34,23}; 
		//int[] a = { 181, 51, 11, 33, 11, 39, 60, 2, 27, 24, 12 };
		
		System.out.print("Array Before Sorting : ");
		System.out.println(Arrays.toString(a));
		
		//Sort using counting sorting algorithm
		radixSort(a,a.length);
		
		System.out.print("Array After Sorting : ");
		System.out.println(Arrays.toString(a));

	}

	private static void radixSort(int[] a, int n) {
		
		int max = getMax(a,n);
	
		for(int pos = 1 ; max/pos > 0 ; pos = pos*10)
		{
			countSort(a, n , pos);
		}
		
	}

	private static void countSort(int[] a, int n, int pos) {
	
		int count[ ] = new int[10] ;
		int b[] = new int [n];
		
		for (int i = 0; i < count.length ; i++) 
		{
			count[i] = 0;
		}
		for(int i = 0 ; i < n ;i++)
		{	
			count[(a[i]/pos)%10]++ ;
		}
		for(int i = 1 ; i < count.length ; i++)
		{
			count[i] = count[i] + count[i - 1];
		}
		for(int i = n-1 ; i >= 0 ; i --)
		{
			b[--count[(a[i]/pos)%10]] = a[i];
		}
		for(int i = 0 ; i < b.length ; i++)
		{
			a[i] = b[i] ;
		}
		
	}

	private static int getMax(int[] a, int n) {
		int max = a[0];
		for (int i = 0; i < n; i++) {
			
			if(a[i] > max)
				max = a[i];
			
		}
		return max;
	}

}
