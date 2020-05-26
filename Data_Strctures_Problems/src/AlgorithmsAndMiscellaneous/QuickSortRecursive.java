package AlgorithmsAndMiscellaneous;

import java.util.Scanner;

public class QuickSortRecursive {

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
		quicksort(a,0,n-1);
		System.out.print("Sorted array : ");
		for (int i = 0; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");

	}

	private static void quicksort(int[] a, int lb, int ub) {
		
		if(lb < ub )
		{
			int loc = partition(a,lb,ub);
			quicksort(a,lb,loc-1);
			quicksort(a,loc+1,ub);
		}
		
	}

	private static int partition(int[] a, int lb, int ub) {
		
		int pivot = a[lb];
		int start = lb;
		int end = ub ;
		
		while(start < end)
		{
			while(a[start] <= pivot && start <= ub)
				start++;
			
			while(a[end] > pivot)
				end--;
			
			if(start < end)
				swap(a,start,end);
		}
		swap(a,lb,end);
		return end;
	}

	private static void swap(int a[] ,int lb, int end) {
		
		int temp = a[lb];
		a[lb] = a[end];
		a[end] = temp;
				
	}

}
