package AlgorithmsAndMiscellaneous;

import java.util.Scanner;

public class MergeSort {

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
		mergeSort(a,0,n-1);
		System.out.print("Sorted array : ");
		for (int i = 0; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");

	}

	private static void mergeSort(int[] a, int lb, int ub) {
		
	    int mid = (lb+ub)/2;
		
		if(lb < ub)
		{
			mergeSort(a, lb, mid);
			mergeSort(a, mid+1, ub);
			merge(a,lb,mid,ub);
		}
		
	}

	private static void merge(int[] a, int lb, int mid, int ub) {
		
		int i = lb;
		int j = mid+1;
		int k = lb;
		int b[] = new int[ub+1];
		
		while(i <= mid && j <= ub)
		{
			if(a[i] <= a[j])
			{
				b[k] = a[i];
				i++;
			}
			else
			{
				b[k] = a[j];
				j++;
			}
			k++;
		}
		
		if(i > mid)
		{	
			while(j <= ub)
			{
				b[k] = a[j];
				k++;
				j++;
			}
		}
		else
		{
			while(i <= mid)
			{
				b[k] = a[i];
				i++;
				k++;
			}
		}
		//Copy b[] into original array a[]
		for(k = lb ; k <= ub ;k++)
		{
			a[k] = b[k];
		}
	}
}
