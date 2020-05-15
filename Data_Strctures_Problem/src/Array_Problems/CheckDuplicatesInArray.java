package Array_Problems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
 
public class CheckDuplicatesInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("How many elements : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
        brutForce(a,n);
        setAddMethodApproach(a,n);
        
    }

	private static void setAddMethodApproach(int[] a, int n) {
		
		Set<Integer> s  =  new LinkedHashSet<>();
		boolean flag = false;
		System.out.print("\nDuplicates using set add method : ");
		for (int i = 0; i < n; i++) {
			if(s.add(a[i]) == false)
			{
				System.out.print(a[i] + " ");
				flag = true;
			}
		}
		if(!flag)
			System.out.println("No Duplicates!!");
		
	}

	private static void brutForce(int[] a, int n) {
		
		System.out.print("Duplicates using brute force : ");
		boolean flag = false;
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = i+1 ; j < n ; j++)
			{
				if(a[i] == a[j])
				{
					System.out.print(a[j] + " ");
					flag = true;
					break;
				}
			}
		}
		if(!flag)
		{
			System.out.println("No Duplicates!!");
		}
		
	}
}
 