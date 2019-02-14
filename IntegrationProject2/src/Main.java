/*
* @author jrobertson08
Eagle Eats - Collect order from user and calculate total, tip, delivery charge
*/

import java.util.Scanner;

public class Main {
	//This is a header
	//public is an access modifier
	//This is the driver class
	
	public static void main(String[] args) {
		//method names should be in lowerCamelCase
		//what is in the (is a parameter)
		//public static void main is a method
		Car myCar = new Car();
		Car kit = new Car();
		Car mysteryMachine = new Car();
		
		myCar.setColor("black");
		System.out.println(myCar.getColor());
		 
		System.out.println("Welcome to Eagle Eats!");
		
		//Get user name	(String Variable = an allocation in memmory for user name)
		//Scope = a variable is only accessable within the mehtod that it is declared
		String userName;
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name? ");
		
		String name = in.nextLine();
		
		//print out greeting using escape methods
		System.out.println("Hello " + name + "," + "\n"+"I'm here to take your order. ");
		
		//Get user total and tip
		double price, tip, total;
		System.out.println("Please enter your the price of your order: ");
			price = in.nextDouble();
		System.out.println("Enter the tip percentage: ");
			tip = in.nextDouble();
			total = (price + price * tip);
			System.out.println("Yout total is: "+ "$" + total);
		in.close();
			double num1 = 5;
			double num2 = 10;
			//this is a call, in the parentheses is an argument, the call takes on the value of the return
			double squared = squareIt(num1, num2, );
			
	}
			
		public static double squareIt(double n2, double n1, string greeting) {
			double squared = n1 + n1;
			return squared;
			//
			
		}

	}
