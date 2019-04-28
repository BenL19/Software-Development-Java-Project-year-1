package questions;

import java.util.Scanner;

public class Index{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

		int choice = 0;

		while(true){
		System.out.println("Welcome to the menu");
		System.out.println("-------------------");
		System.out.println("Choose a program to run:");
		System.out.println();

		System.out.println("1. Lisa.java");
		System.out.println("2. BigNumber.java");
		System.out.println("3. Number.java");
		System.out.println("4. Two.java");
		System.out.println("5. NameAge.java");
		System.out.println("6. ForLoop.java");
		System.out.println("7. Months.java");
		System.out.println("8. Cards.java");
		System.out.println("Enter -1 to end");
		System.out.println();
		System.out.print("Enter your choice: ");
		choice = input.nextInt();
		System.out.println();

		if(choice == 1){
			Lisa.main(new String[0]);
		}else if(choice == 2){
			BigNumber.main(new String[0]);
		}else if(choice == 3){
			Number.main(new String[0]);
		}else if(choice == 4){
			Two.main(new String[0]);
		}else if(choice == 5){
			NameAge.main(new String[0]);
		}else if(choice == 6){
			ForLoop.main(new String[0]);
		}else if(choice == 7){
			Months.main(new String[0]);
		}else if(choice == 8){
			Cards.main(new String[0]);
		}else if(choice == -1){
			break;
		}else{
			System.out.println("Invalid entry");
		}
		System.out.println();

		}
    } //end main
} // end class
