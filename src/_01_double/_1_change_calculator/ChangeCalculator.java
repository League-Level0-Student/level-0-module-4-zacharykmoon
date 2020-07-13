package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {


	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickel = JOptionPane.showInputDialog(" how many nickels do you have?");

int n = Integer.parseInt(nickel)*5;
		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer
String dime = JOptionPane.showInputDialog(" how many dimes do you have?");

int d = Integer.parseInt(dime)*10;
		// Ask the user how many quarters they have, and convert their answer
String quarter = JOptionPane.showInputDialog(" how many quarters do you have?");

int q = Integer.parseInt(quarter)*25;
double total = (n+d+q);
		// Calculate how much money the user has.  Hint: Use a double variable 
System.out.println(total);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

