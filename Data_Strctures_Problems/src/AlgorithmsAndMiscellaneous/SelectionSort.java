package AlgorithmsAndMiscellaneous;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("How many elements : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		selection_sort(a,n);
		System.out.print("Sorted array : ");
		for (int i = 0; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");

	}

	private static void selection_sort(int[] a, int n) {
	
		for(int i = 0 ; i < n-1 ; i++)
		{
			int min = i;
			for(int j = i + 1 ; j < n ;j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min] ;
			a[min] = temp;
		}
		
	}

}
