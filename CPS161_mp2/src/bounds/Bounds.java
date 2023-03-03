package bounds;

import java.util.*;

public class Bounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Starting number: ");
		Scanner input1 = new Scanner(System.in);
		int startingNumber = input1.nextInt();
		System.out.println();
		
		System.out.print("Upper bound: ");
		Scanner input2 = new Scanner(System.in);
		int upperBound = input2.nextInt();
		System.out.println();
		
		System.out.print("Step size: ");
		Scanner input3 = new Scanner(System.in);
		int stepSize = input3.nextInt();
		System.out.println();
		
		int number = startingNumber;
		
		while(number < upperBound) {
			System.out.print(number + " ");
			number += stepSize;
		}
	}

}
