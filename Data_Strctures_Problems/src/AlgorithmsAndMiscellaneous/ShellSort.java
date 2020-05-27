package AlgorithmsAndMiscellaneous;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int a[] = {23 , 29 ,15 ,19 , 31 , 7 , 9 , 5 , 2,1};
		int n = a.length;
		
		System.out.print("Array Before Sorting : ");
		System.out.println(Arrays.toString(a));
		
		//Sort using counting sorting algorithm
		shellSort(a,n);
		
		System.out.print("Array After Sorting : ");
		System.out.println(Arrays.toString(a));

	}

	private static void shellSort(int[] a, int n) {
		
		for(int gap = n/2 ; gap >= 1 ; gap = gap/2 )
		{
			for(int j = gap ; j < n ; j++)
			{
				for(int i = j-gap ; i >=0 ; i = i - gap)
				{
					if(a[i+gap] > a[i])
						break;
					else
					{
						int temp = a[i+gap];
						a[i+gap] = a[i] ;
						a[i] = temp ;
					}
				}
			}
		}
		
	}
}
