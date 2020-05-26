package AlgorithmsAndMiscellaneous;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) throws Exception {
		Scanner sc  = new Scanner(System.in);
		System.out.print("How many elements : ");
		int n = sc.nextInt();
		
		int a[] = new int[n+1]; //Plus 1 Because a[0] = -1 extra space is needed to avoid arrayIndexOutOfBoundsException when ptr < 0
		a[0] = -999;
		System.out.println("Enter the array elements : ");
		for (int i = 1; i <= n ; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		insertion_sort(a,n);
		System.out.print("Sorted array : ");
		for (int i = 1; i <= n ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");

	}

	private static void insertion_sort(int[] a, int n) throws Exception  {
		
		for(int i = 2 ; i <= n ; i++)
		{
			int temp = a[i];
			int ptr = i - 1;
			while(temp < a[ptr] && ptr >= 0)
			{
				a[ptr+1] = a[ptr];
				ptr--;
			}
			a[ptr+1] = temp ;
		}
		
	}

}
