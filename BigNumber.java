package questions;

import java.util.Scanner;

public class BigNumber{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int number = 0;
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if(number > 1000000) {
			System.out.println("That is a big number");
		}

    } //end main
} // end class