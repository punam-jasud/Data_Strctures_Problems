package AlgorithmsAndMiscellaneous;

import java.util.Scanner;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Varaible : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Varaible : ");
		int n2 = sc.nextInt();
		sc.close();
		
		System.out.println("Before Swapping : \n" );
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		
		//swap logic 
		n1 = n1 + n2 ;
		n2 = n1 - n2 ;
		n1 = n1 - n2;
		
		System.out.println("\nAfter Swapping  : \n" );
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		
		//swap logic using XOR
		n1 = n1 ^ n2 ;
		n2 = n1 ^ n2 ;
		n1 = n1 ^ n2;
				
		System.out.println("\nAfter Swapping  : \n" );
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);		
		
	}

}
