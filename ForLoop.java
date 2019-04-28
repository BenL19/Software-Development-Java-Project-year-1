package questions;

import java.util.Scanner;

public class ForLoop{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int first = 0;
		int second = 0;
		int third = 0;
		int fourth = 0;
		int fifth = 0;
		int sixth = 0;
		int seventh = 0;
		int eighth = 0;
		int ninth = 0;
		int tenth = 0;
		
		for(int count = 1; count <= 10; count++) {
			System.out.print("Enter number "+count+": ");
			if(count == 1) {
				first = input.nextInt();
			}else if(count == 2) {
				second = input.nextInt();
			}else if(count == 3) {
				third = input.nextInt();
			}else if(count == 4) {
				fourth = input.nextInt();
			}else if(count == 5) {
				fifth = input.nextInt();
			}else if(count == 6) {
				sixth = input.nextInt();
			}else if(count == 7) {
				seventh = input.nextInt();
			}else if(count == 8) {
				eighth = input.nextInt();
			}else if(count == 9) {
				ninth = input.nextInt();
			}else if(count == 10) {
				tenth = input.nextInt();
			}
		}
		
		int odd = 0;
		
		if(first % 2 != 0){
			odd = odd + first;	
		}if(second % 2 != 0){
			odd = odd + second;
		}if(third % 2 != 0){
			odd = odd + third;
		}if(fourth % 2 != 0){
			odd = odd + fourth;
		}if(fifth % 2 != 0){
			odd = odd + fifth;
		}if(sixth % 2 != 0){
			odd = odd + sixth;
		}if(seventh % 2 != 0){
			odd = odd + seventh;
		}if(eighth % 2 != 0){
			odd = odd + eighth;
		}if(ninth % 2 != 0){
			odd = odd + ninth;
		}if(tenth % 2 != 0){
			odd = odd + tenth;
		}
		
		System.out.println();
		System.out.println("Sum of odd numbers is "+odd);
		
    } //end main
} // end classpackage questions;