import java.util.Scanner;

public class FirstAssignment {
	
	// Commission Rates
	//$0.01-$5,000                                    8  percent
	//$5,000.01 - $10,000                        10 percent
	//$10,000.01- and above                   12 percent
	
	private static double first_commission_rate = (double) .08;
	private static double second_commision_rate = (double) .1;
	private static double third_commision_rate = (double) .12;
	
	private static double commision_earned = (double) .00;
	
	private static double base_salary = (double) 5000.00;
	private static double current_salary = (double) 0.00;
	private static double desired_salary = (double) 30000.00;
	
	private static double sales_ammount = (double) 0.00;

	
	public static void main(String[] args) {
		
		current_salary += base_salary;
		
		while(current_salary < desired_salary) {
			add_a_dollar_to_sales();
			print_information();
		}

	}
	
	// This will not come out perfect due to base 10 to base 2 conversion in binary
	// https://javarevisited.blogspot.com/2012/02/java-mistake-1-using-float-and-double.html
	
	public static void add_a_dollar_to_sales() {
		double dollar = (double) 1.00;
		sales_ammount += 1;
		//Adding the commission made from the dollar
		current_salary += calculate_commision()*dollar;
	}
	
	
	
	public static double calculate_commision() {
		
		if(sales_ammount <= 5000) {
			//Following two lines used for testing
			//Scanner my_obj = new Scanner(System.in);
			//String check_ammount = myObj.nextLine();
			commision_earned = first_commission_rate;
		} else if(sales_ammount <= 10000) {
			commision_earned = second_commision_rate;
		}else {

			commision_earned = third_commision_rate;
		}
		return commision_earned;
	}
	
	
	public static void print_information() {
		System.out.println("Sales Ammount Commision");
		System.out.print(sales_ammount);
		System.out.print("      ");
		System.out.print(current_salary);
		System.out.print("\n");
		
	}

}
