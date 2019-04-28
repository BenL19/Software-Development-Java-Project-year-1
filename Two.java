package questions;

import java.util.Scanner;

public class Two{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int first = 0;
		int second = 0;
		
		System.out.print("Enter a number: ");
		first = input.nextInt();
		
		System.out.print("Enter a number: ");
		second = input.nextInt();
		
		if(first == 2 && second == 2) {
			System.out.println("Both numbers are 2");
		}else if(first != 2 && second != 2) {
			System.out.println("Neither number is 2");
		}else if(first == 2 || second == 2){
				if(second != 2) {
					System.out.println("First number is 2");
				}else if(first != 2) {
					System.out.println("Second number is 2");
				}
		}

    } //end main
} // end class
