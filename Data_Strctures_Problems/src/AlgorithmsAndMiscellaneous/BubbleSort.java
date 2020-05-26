package AlgorithmsAndMiscellaneous;

import java.util.Scanner;

public class BubbleSort {

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
		bubble_sort(a,n);
		System.out.print("Sorted array : ");
		for (int i = 0; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
	}

	private static void bubble_sort(int[] a, int n) {
		for(int i = 1; i < n ; i++)
		{
			boolean flag = false ;
			for(int j = 0 ; j < n-1 ; j++)
			{
				if(a[j] > a[j+1] )
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false)
				break;
		}
		
	}

}
