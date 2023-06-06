package org.comit.course._04_scaner;

import java.util.Scanner;
public class Scan{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Scanner  - accepts user input.
		try (Scanner scan = new Scanner(System.in)){
		
		System.out.println("Please, input your name:");
		String name = scan.next(); // Read string from the keyboard.
		
		System.out.println("Please, input your age:");
		int age = scan.nextInt(); // Read integer from the keyboard.
		
		System.out.println("Your name is: " + name + " and your age is: " + age);
		System.out.printf("Your name is: %s and your age is: %d %n", name, age);
		}
	}
}
		
	


