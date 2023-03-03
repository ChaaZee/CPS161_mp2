package temperature;

import java.util.*;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c_temp = 0;
		int i = 0;
		double total_f_temp = 0;
		double total_c_temp = 0;
		
		while(c_temp > -100) {
			System.out.print("Enter Temp in Celsius or <= -100.0 to quit: ");
			Scanner input1 = new Scanner(System.in);
			c_temp = input1.nextDouble();
			
			if(c_temp > -100) {
				double f_temp = (9.0/5.0 * c_temp) + 32.0;
				
				System.out.println("Temperature: ");
				System.out.println("F(" + f_temp + ")");
				System.out.println("C(" + c_temp + ")");
				System.out.println();
				
				i += 1;
				total_f_temp += f_temp;
				total_c_temp += c_temp;
			} else {
				double f_average = total_f_temp/i;
				double c_average = total_c_temp/i;
				
				System.out.println("Average: Celsius(" + c_average + ")");
				System.out.println("Average: Fahrenheit(" + f_average + ")");
			}
		}
		
	}

}
