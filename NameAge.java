package questions;

import java.util.Scanner;

public class NameAge{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String name = "";
		int age = 0;
		int count = 1;
		
		System.out.print("Enter your name: ");
		name = input.next();
		
		System.out.print("Enter your age: ");
		age = input.nextInt();
		
		while(count <= age) {
			System.out.println(name);
			count++;
		}

    } //end main
} // end classpackage questions;