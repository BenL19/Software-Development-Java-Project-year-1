package questions;

import java.util.Scanner;

public class Number{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int number = 0;
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if(number > 0) {
			System.out.println("This is a positive number");
		}else if(number < 0) {
			System.out.println("This is a negative number");
		}else {
			System.out.println("This is zero");
		}

    } //end main
} // end class
