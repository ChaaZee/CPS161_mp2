package factorial;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean i = true;
		
		while(i) {
			System.out.print("Enter a Number: ");
			Scanner input1 = new Scanner(System.in);
			int number = input1.nextInt();
			int factorial = number;
			
			while(number > 1) {
				factorial *= (number - 1);
				number -= 1;
			}
			
			System.out.println("Factorial: " + factorial);
			
			System.out.print("Do you want to continue(y/n): ");
			Scanner input2 = new Scanner(System.in);
			String c = input2.nextLine();
			System.out.println();
			
			if(c.charAt(0) == 'y') {
				i = true;
			}else if (c.charAt(0) == 'n') {
				i = false;
				System.out.println("Have a good day");
			}
			
		}
	}

}
