package patikadev;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1;
	    Scanner input = new Scanner(System.in);
	    
		System.out.print("Please enter the number of elements of the fibonacci series :");
	    int  count = input.nextInt();


		for (int i = 2; i < count; ++i) {
			
			System.out.print(n1+ " ");
			int nextN = n1 + n2;
			n1 = n2;
			n2 = nextN;
		}

	}

}
