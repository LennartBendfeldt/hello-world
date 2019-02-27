package project1;

import java.util.*;

public class Calculatornew {
	
	Scanner kb = new Scanner(System.in);
	double var1;
	double var2;
	String operator;
	String answer;


	public static void main(String[] args) {
		
		Calculatornew calculator;
		calculator = new Calculatornew();
		
		calculator.menu();
	}
	
	public void menu() {
		
		System.out.println("Give me a function with 2 numbers (e.g. '2 + 2', '33 / 4', etc.)");
		
		var1 = kb.nextDouble();
		operator = kb.next();
		var2 = kb.nextDouble();
		
		if(operator.equals("+")) {
			
			addition();
		}
		
		else if(operator.equals("-")) {
			
			subtraction();
		}
		
		else if(operator.equals("*")) {
			
			multiplication();
		}
		else if(operator.equals("/")) {
			
			division();
		}
		else {
			
			System.out.println("Incorrect format, let's try again!");
			menu();
		}
		
		System.out.println("Would you like to do another calculation?(y/n)");
		answer = kb.next();
		
		if(answer.equalsIgnoreCase("y")) {
			
			menu();
		}
		else {
			
		}
	}
	
	public void addition() {
		
		System.out.println("Your answer is: " + (var1 + var2));
		
	}
	
	public void subtraction() {
		
		System.out.println("Your answer is: " + (var1 - var2));
	}
	
	public void multiplication() {
		
		System.out.println("Your answer is " + (var1 * var2));
	}
	
	public void division() {
		
		System.out.println("Your answer is " + (var1 / var2));
	}

}
